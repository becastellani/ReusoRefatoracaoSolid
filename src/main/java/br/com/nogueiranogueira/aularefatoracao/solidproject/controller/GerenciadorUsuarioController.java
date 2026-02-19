package br.com.nogueiranogueira.aularefatoracao.solidproject.controller;

import br.com.nogueiranogueira.aularefatoracao.solidproject.controller.response.GerenciadorUsuarioResponseHandler;
import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.GerenciadorUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gerenciador/usuarios")
public class GerenciadorUsuarioController {

    @Autowired
    private GerenciadorUsuarioService gerenciadorUsuarioService;

    @PostMapping
    public ResponseEntity<String> criarUsuario(@RequestBody UsuarioDTO usuario) {
        try {
            gerenciadorUsuarioService.criarUsuario(usuario);
            return GerenciadorUsuarioResponseHandler.sucesso("Usuário criado com sucesso");
        } catch (Exception e) {
            return GerenciadorUsuarioResponseHandler.erro(e);
        }
    }
}
