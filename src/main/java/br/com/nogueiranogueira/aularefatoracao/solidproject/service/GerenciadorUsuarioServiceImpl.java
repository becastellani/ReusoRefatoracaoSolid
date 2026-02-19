package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.repository.UsuarioRepository;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.GerenciadorUsuarioService;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.GerenciadorUsuarioValidacaoService;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.UsuarioFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GerenciadorUsuarioServiceImpl implements GerenciadorUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private GerenciadorUsuarioValidacaoService validacaoService;

    @Autowired
    private UsuarioFactory factoryService;

    @Override
    public Usuario criarUsuario(UsuarioDTO dto) {
        validacaoService.validarUsuarioDTO(dto);

        Usuario usuario = factoryService.criarUsuarioAPartirDeDTO(dto);

        return usuarioRepository.save(usuario);
    }
}

