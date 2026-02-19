package br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

/**
 * Serviço responsável pelo gerenciamento de usuários através de DTOs.
 */
public interface GerenciadorUsuarioService {

    /**
     * Cria um usuário a partir de um DTO.
     *
     * @param dto o DTO contendo os dados do usuário
     * @return o usuário criado
     * @throws IllegalArgumentException se os dados forem inválidos
     */
    Usuario criarUsuario(UsuarioDTO dto);
}

