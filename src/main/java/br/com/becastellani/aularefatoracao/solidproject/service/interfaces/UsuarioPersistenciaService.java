package br.com.becastellani.aularefatoracao.solidproject.service.interfaces;

import br.com.becastellani.aularefatoracao.solidproject.model.Usuario;

/**
 * Serviço responsável pela persistência de usuários no banco de dados.
 */
public interface UsuarioPersistenciaService {

    /**
     * Verifica se um email já está cadastrado no sistema.
     *
     * @param email o email a ser verificado
     * @return true se o email já está cadastrado, false caso contrário
     */
    boolean emailJaCadastrado(String email);

    /**
     * Salva um usuário no banco de dados.
     *
     * @param usuario o usuário a ser salvo
     */
    void salvarUsuario(Usuario usuario);
}

