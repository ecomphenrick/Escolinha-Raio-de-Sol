package model;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Turma> turmas; //Lista de Turmas
    private List<Professor> professores; //Lista de Professores
    private List<Aluno> alunos; //Lista de alunos
    private List<Professor> professoresSemTurma = new ArrayList<>(); //Lista de Professores que não tem turma.

    //Método que adiciona o professor que ta sem turma.
    public void adicionarProfessorSemTurma(Professor professor) {
        this.professoresSemTurma.add(professor);
    }

    //getters e setters.
    public List<Professor> getProfessoresSemTurma() {
        return professoresSemTurma;
    }

    public void setProfessoresSemTurma(List<Professor> professoresSemTurma) {
        this.professoresSemTurma = professoresSemTurma;
    }


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Escola(){
        this.turmas = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
