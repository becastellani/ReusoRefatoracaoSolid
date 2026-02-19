package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.UsuarioMailSenderService;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.UsuarioPersistenciaService;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.UsuarioValidacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.UsuarioService {

    @Autowired
    private UsuarioValidacaoService validacaoService;

    @Autowired
    private UsuarioPersistenciaService persistenciaService;

    @Autowired
    private UsuarioMailSenderService mailSenderService;

    @Override
    public void criarUsuario(Usuario usuario) {
        validacaoService.validarUsuario(usuario);

        if (persistenciaService.emailJaCadastrado(usuario.getEmail())) {
            throw new IllegalArgumentException("E-mail já cadastrado");
        }

        persistenciaService.salvarUsuario(usuario);

        mailSenderService.enviarEmailBoasVindas(usuario);
    }
}

