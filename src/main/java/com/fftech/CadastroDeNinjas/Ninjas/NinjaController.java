package com.fftech.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {


    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira menssagem nessa rota!";
    }

    //Adicionar Ninja (CREATE)
    @PostMapping("/cadastrar")
    public String criarNinja() {
        return "Ninja cadastrado";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Mostrar Ninjas";
    }

    //Mostrar ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar Ninja por ID";
    }

    //Alterar dados do Ninja (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar Ninja por id";
    }

    //Deletar dados dos Ninjas (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Ninja deletado por id";
    }


}
