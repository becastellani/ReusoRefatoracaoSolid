package br.com.nogueiranogueira.aularefatoracao.solidproject.controller.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GerenciadorUsuarioResponseHandler {

    public static ResponseEntity<String> sucesso(String mensagem) {
        return ResponseEntity.ok(mensagem);
    }

    public static ResponseEntity<String> erro(Exception e) {
        if (e instanceof IllegalArgumentException) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Erro ao criar usuário");
    }
}

