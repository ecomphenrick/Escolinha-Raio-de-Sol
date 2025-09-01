package model;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Turma> turmas; // Lista de Turmas
    private List<Professor> professores; // Lista de Professores
    private List<Aluno> alunos; // Lista de alunos
    private List<Professor> professoresSemTurma = new ArrayList<>(); // Lista de Professores que não têm turma

    // Construtor
    public Escola() {
        this.turmas = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.professoresSemTurma = new ArrayList<>();
    }

    // Método que adiciona o professor que está sem turma
    public void adicionarProfessorSemTurma(Professor professor) {
        this.professoresSemTurma.add(professor);
    }

    // Getter dinâmico que retorna todos os professores (com e sem turma)
    public List<Professor> getProfessoresGeral() {
        List<Professor> geral = new ArrayList<>();
        geral.addAll(this.professores);
        geral.addAll(this.professoresSemTurma);
        return geral;
    }

    // Getters e setters
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

