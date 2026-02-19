package br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

/**
 * Serviço responsável pela validação de dados de usuários.
 */
public interface UsuarioValidacaoService {

    /**
     * Valida os dados de um usuário.
     *
     * @param usuario o usuário a ser validado
     * @throws IllegalArgumentException se os dados do usuário forem inválidos
     */
    void validarUsuario(Usuario usuario);
}

