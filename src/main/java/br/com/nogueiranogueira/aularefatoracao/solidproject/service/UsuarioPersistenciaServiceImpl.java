package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.UsuarioPersistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UsuarioPersistenciaServiceImpl implements UsuarioPersistenciaService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean emailJaCadastrado(String email) {
        Integer count = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM usuarios WHERE email = ?",
                Integer.class,
                email);
        return count != null && count > 0;
    }

    @Override
    public void salvarUsuario(Usuario usuario) {
        jdbcTemplate.update(
                "INSERT INTO usuarios (nome, email) VALUES (?, ?)",
                usuario.getNome(),
                usuario.getEmail());
    }
}

