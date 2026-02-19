package br.com.becastellani.aularefatoracao.solidproject.service.interfaces;

import br.com.becastellani.aularefatoracao.solidproject.model.Usuario;

/**
 * Serviço responsável pelo envio de emails relacionados a usuários.
 */
public interface UsuarioMailSenderService {

    /**
     * Envia um email de boas-vindas para o usuário.
     *
     * @param usuario o usuário que receberá o email
     */
    void enviarEmailBoasVindas(Usuario usuario);
}

