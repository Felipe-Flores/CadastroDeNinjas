package com.fftech.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//essa anotação ele abre para o request mapping
@RestController

//essa anotação ele mapea as rotas da aplicação
@RequestMapping("/missoes")

public class MissoesController {

    public MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // Get -- Mandar uma requisição para mostrar as missoes
    // Post -- Mandar uma requisição criar as missoes
    @PostMapping("/cadastrar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao) {
        return missoesService.criarMissao(missao);
    }

    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes() {
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id) {
        return missoesService.listarMissoesPorId(id);
    }

    // Put -- Mandar uma requisição para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao Alterada com sucesso!";
    }

    /*// Delete -- Mandar uma requisição para deletar as missoes
    @DeleteMapping("/deletar/{id}")
    public void deletarMissoesPorId(@PathVariable Long id) {
        missoesService.deletarNissoesPorId(id);
    }*/

}