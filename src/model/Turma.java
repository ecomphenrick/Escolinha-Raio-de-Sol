package model;

import java.util.List;

public class Turma {
    private String serie;
    private String anoLetivo;
    private Professor professor;
    private List<Aluno> alunos;
    //Construtor da classe, (Professor está como String, ver como ligar)
    public Turma (String serie, String anoLetivo, Professor professor, List<Aluno> alunos){
        this.serie = serie;
        this.anoLetivo = anoLetivo;
        this.professor = professor;
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }


    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}

