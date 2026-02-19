package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.service.interfaces.GerenciadorUsuarioValidacaoService;
import org.springframework.stereotype.Service;

@Service
public class GerenciadorUsuarioValidacaoServiceImpl implements GerenciadorUsuarioValidacaoService {

    @Override
    public void validarUsuarioDTO(UsuarioDTO dto) {
        validarNome(dto.nome());
        validarEmail(dto.email());
        validarTipo(dto.tipo());

        if ("VIP".equals(dto.tipo())) {
            validarIdade(dto.idade());
        }
    }

    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }
    }

    private void validarEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
    }

    private void validarTipo(String tipo) {
        if (tipo == null || (!tipo.equals("COMUM") && !tipo.equals("VIP"))) {
            throw new IllegalArgumentException("Tipo inválido");
        }
    }

    private void validarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Usuário deve ser maior de idade");
        }
    }
}

