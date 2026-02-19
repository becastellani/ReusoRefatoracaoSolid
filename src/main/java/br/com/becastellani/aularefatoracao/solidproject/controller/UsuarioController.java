package br.com.becastellani.aularefatoracao.solidproject.controller;

import br.com.becastellani.aularefatoracao.solidproject.controller.response.UsuarioResponseHandler;
import br.com.becastellani.aularefatoracao.solidproject.model.Usuario;
import br.com.becastellani.aularefatoracao.solidproject.service.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<String> criarUsuario(@RequestBody Usuario usuario) {
        try {
            usuarioService.criarUsuario(usuario);
            return UsuarioResponseHandler.sucesso("Usuário criado com sucesso");
        } catch (Exception e) {
            return UsuarioResponseHandler.erro(e);
        }
    }
}
