package model;

import java.util.List;

public class Responsavel extends Pessoa {

    private String telefone;
    private List<Aluno> dependentes;

    public Responsavel (String nome, String telefone, List<Aluno> dependentes){
        super(nome);
        this.telefone = telefone;
        this.dependentes = dependentes;

    }
}

//Classe com construtor, organizar getter e setter.
