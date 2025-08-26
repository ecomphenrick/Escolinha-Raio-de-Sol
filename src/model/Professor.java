package model;

import java.util.List;

public class Professor extends Pessoa {
    private String formacao;
    private String telefone;
    private Turma turma;
    private List<Aluno> dependente;

    // Construtor
    public Professor(String nome, String formacao, Turma turma, String telefone, List<Aluno> dependente){
        super(nome); // chama o construtor da superclasse Pessoa
        this.formacao = formacao;
        this.turma = turma;
        this.telefone = telefone;
        this.dependente = dependente;
    }
}

//Classe com o contrutor, organizar getter e setter.
