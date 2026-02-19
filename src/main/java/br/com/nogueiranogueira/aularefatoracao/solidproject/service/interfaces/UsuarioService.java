package br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

/**
 * Serviço responsável pela criação e gerenciamento de usuários.
 */
public interface UsuarioService {

    /**
     * Cria um novo usuário no sistema.
     *
     * @param usuario o usuário a ser criado
     * @throws IllegalArgumentException se os dados do usuário forem inválidos ou o email já estiver cadastrado
     */
    void criarUsuario(Usuario usuario);
}

