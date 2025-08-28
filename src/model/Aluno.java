package model;

import java.util.List;
//Criação de Classe Aluno

public class Aluno extends Pessoa {
    private String naturalidade;
    private Responsavel responsavel;
    private Turma turma;

    // Construtor
    public Aluno(String nome, String dataNascimento, Endereco endereco, String naturalidade, Responsavel responsavel, Turma turma) {
        super(nome, dataNascimento, endereco);
        this.naturalidade = naturalidade;
        this.responsavel = responsavel;
        this.turma = turma;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
