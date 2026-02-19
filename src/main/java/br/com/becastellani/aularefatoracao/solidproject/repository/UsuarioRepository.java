package br.com.becastellani.aularefatoracao.solidproject.repository;

import br.com.becastellani.aularefatoracao.solidproject.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    long countByTipo(String tipoUsuario);
}
