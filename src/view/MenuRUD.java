package view;

import model.Aluno;
import model.Escola;
import model.Turma;

import java.util.List;
import java.util.Scanner;

public class MenuRUD {

    Scanner sc = new Scanner(System.in);
    public void ExibirLer(Escola escola, Turma turma){
        System.out.println("Turma: " + turma.getSerie() + " - " + turma.getAnoLetivo());
        System.out.println("Professor: " + turma.getProfessor().getNome());
        System.out.println("Alunos: ");
        System.out.println("");
        List<Aluno> alunos = turma.getAlunos();
        for(Aluno aluno : alunos){
            System.out.println("Nome: " + aluno.getNome());
        }
        }

    }

