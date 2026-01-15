package com.fftech.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

//essa anotação ele abre para o request mapping
@RestController

//essa anotação ele mapea as rotas da aplicação
@RequestMapping("missoe")

public class MissoesController {

    // Get -- Mandar uma requisição para mostrar as missoes
    @GetMapping("/lista")
    public String listarMissoes() {
        return "Missoes listadas com sucesso";
    }

    // Post -- Mandar uma requisição criar as missoes
    @PostMapping("/cadastrar")
    public String cadastrarNissao() {
        return "Missao cadastrada!";
    }

    // Put -- Mandar uma requisição para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao Alterada com sucesso!";
    }

    // Delete -- Mandar uma requisição para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarNissao() {
        return "Missao deletada com sucesso!";
    }


}
