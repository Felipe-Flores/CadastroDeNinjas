package com.fftech.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fftech.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "dificuldade")
    private String dificuldade;


    // @OneToMany Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")

    //essa anotação ingnora o erro de serealização
    @JsonIgnore
    private List<NinjaModel> ninjas;




}
