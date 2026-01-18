package com.fftech.CadastroDeNinjas.Ninjas;
import com.fftech.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class NinjaDTO {

    private Long id;
    private String nome;
    private int idade;
    private String email;
    private String imgUrl;
    private String rank;
    private MissoesModel missoes;

}
