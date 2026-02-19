package br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;

/**
 * Serviço responsável pela validação de DTOs de usuários.
 */
public interface GerenciadorUsuarioValidacaoService {

    /**
     * Valida os dados de um DTO de usuário.
     *
     * @param dto o DTO a ser validado
     * @throws IllegalArgumentException se os dados forem inválidos
     */
    void validarUsuarioDTO(UsuarioDTO dto);
}

