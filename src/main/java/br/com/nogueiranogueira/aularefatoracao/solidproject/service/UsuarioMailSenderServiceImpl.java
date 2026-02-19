package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.UsuarioMailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class UsuarioMailSenderServiceImpl implements UsuarioMailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void enviarEmailBoasVindas(Usuario usuario) {
        if (mailSender == null) {
            return;
        }

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(usuario.getEmail());
        message.setSubject("Bem-vindo!");
        message.setText("Olá " + usuario.getNome() + ", seu cadastro foi realizado com sucesso.");

        mailSender.send(message);
    }
}

