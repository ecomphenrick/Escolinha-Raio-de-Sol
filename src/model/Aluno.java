package model;

import java.util.List;
//Criação de Classe Aluno

public class Aluno extends Pessoa {
    private String naturalidade;
    private Responsavel responsavel;
    private Turma turma;
    private List<Boletim> boletim;

    // Construtor
    public Aluno(String nome, String naturalidade, Responsavel responsavel, Turma turma, List<Boletim> boletim) {
        super(nome); // chama o construtor da superclasse Pessoa
        this.naturalidade = naturalidade;
        this.responsavel = responsavel;
        this.turma = turma;
        this.boletim = boletim;
    }

    //Fiz o construtor e preciso organizar os getters e setters.

}
