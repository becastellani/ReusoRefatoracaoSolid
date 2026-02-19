package br.com.becastellani.aularefatoracao.solidproject.service.interfaces;

import br.com.becastellani.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.becastellani.aularefatoracao.solidproject.model.Usuario;

/**
 * Factory responsável pela criação de objetos Usuario.
 */
public interface UsuarioFactory {

    /**
     * Cria um objeto Usuario a partir de um UsuarioDTO.
     *
     * @param dto o DTO contendo os dados do usuário
     * @return o usuário criado
     */
    Usuario criarUsuarioAPartirDeDTO(UsuarioDTO dto);
}

