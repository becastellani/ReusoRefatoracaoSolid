package br.com.becastellani.aularefatoracao.solidproject.service;

import br.com.becastellani.aularefatoracao.solidproject.model.Usuario;
import br.com.becastellani.aularefatoracao.solidproject.service.interfaces.UsuarioValidacaoService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioValidacaoServiceImpl implements UsuarioValidacaoService {

    @Override
    public void validarUsuario(Usuario usuario) {
        validarNome(usuario.getNome());
        validarEmail(usuario.getEmail());
    }

    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }
    }

    private void validarEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
    }
}

