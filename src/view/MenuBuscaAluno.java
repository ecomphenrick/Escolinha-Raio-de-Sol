package view;

import model.Aluno;
import model.Escola;

import java.util.List;
import java.util.Scanner;

public class MenuBuscaAluno {
    Scanner sc = new Scanner(System.in);
    public void ExibirMenuAluno(Escola escola){
        List<Aluno> alunos = escola.getAlunos();
        System.out.println("0 - Ler");
        System.out.println("1 - Atualizar");
        System.out.println("2 - Deletar");
        System.out.println("3 - Sair");
        int acao = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine().trim();
        Aluno buscado = null;
        for (Aluno aluno : alunos){
            if(aluno.getNome().equalsIgnoreCase(nome)){
                buscado = aluno;
                break;
            }
        }

        if(buscado == null){
            System.out.println("Não há aluno com esse nome aqui.");
        }else {
            switch (acao){
                case 1:
                    System.out.println("Nome: " + buscado.getNome());
                    System.out.println("Data de Nascimento: " + buscado.getDataNascimento());
                    System.out.println("Endereço: " + buscado.getEndereco());
                    System.out.println("Naturalidade: " + buscado.getNaturalidade());
                    System.out.println("Responsável: " + buscado.getResponsavel());
                    System.out.println("Turma: " + buscado.getTurma());
                    break;
                case 2:
                    //Ver como implementar
                    break;
                case 3:
                    escola.getAlunos().remove(buscado);
                    break;
            }

        }


    }
}
