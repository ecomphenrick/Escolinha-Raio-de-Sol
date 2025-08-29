package model;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Turma> turmas;
    private List<Professor> professores;
    private List<Aluno> alunos;
    private List<Professor> professoresSemTurma = new ArrayList<>();

    public List<Professor> getProfessoresSemTurma() {
        return professoresSemTurma;
    }

    public void setProfessoresSemTurma(List<Professor> professoresSemTurma) {
        this.professoresSemTurma = professoresSemTurma;
    }

    public void adicionarProfessorSemTurma(Professor professor) {
        this.professoresSemTurma.add(professor);
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
