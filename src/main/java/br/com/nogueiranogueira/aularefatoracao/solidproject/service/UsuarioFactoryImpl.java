package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.UsuarioFactory;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFactoryImpl implements UsuarioFactory {

    @Override
    public Usuario criarUsuarioAPartirDeDTO(UsuarioDTO dto) {
        Usuario usuario = new Usuario(dto.nome(), dto.email(), dto.tipo());

        if ("COMUM".equals(dto.tipo())) {
            usuario.setPontos(0);
        } else if ("VIP".equals(dto.tipo())) {
            usuario.setPontos(100);
        }

        return usuario;
    }
}

