package view;

import model.Aluno;
import model.Escola;
import model.Turma;

import java.util.List;
import java.util.Scanner;

public class MenuRUD {
    Scanner sc = new Scanner(System.in);
    public void ExibirMenuTurma(Turma turma){
        System.out.println("O que você deseja fazer? ");
        int acao;
        do {
            System.out.println("0 - Ler Turma.");
            System.out.println(("1 - Atualizar Turma."));
            System.out.println("2 - Deletar Turma.");
            System.out.println("3 - Sair");
            acao = sc.nextInt();
            sc.nextLine();
            switch (acao){
                case 0:
                    System.out.println("Turma: " + turma.getSerie() + " - " + turma.getAnoLetivo());
                    System.out.println("Professor: " + turma.getProfessor().getNome());
                    System.out.println("Alunos: ");
                    System.out.println("");
                    List<Aluno> alunos = turma.getAlunos();
                    for(Aluno aluno : alunos){
                        System.out.println("Nome: " + aluno.getNome());
                    }
                    break;
                case 1:
                    //Chamar função atualizar;
                    break;
                case 2:
                    //Chamar função deleta;
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
            }

        }while (acao!=3);

    }
}
