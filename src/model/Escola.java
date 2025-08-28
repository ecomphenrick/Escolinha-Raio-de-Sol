package model;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Turma> turmas;
    private List<Professor> professores;

    public Escola(){
        this.turmas = new ArrayList<>();
        this.professores = new ArrayList<>();
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
