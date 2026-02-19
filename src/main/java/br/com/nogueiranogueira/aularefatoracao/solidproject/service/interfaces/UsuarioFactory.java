package br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

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

