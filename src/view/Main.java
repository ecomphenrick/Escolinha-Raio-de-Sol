package view;

import controller.Cadastro;
import model.Aluno;
import model.Pessoa;

import java.util.Scanner;

//Classe main com teste do get e set da classe pessoa usando atributo nome, funcionando normal.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolinha Raio de Sol!");
        int acao;
        do{
            System.out.println("Digite a opção desejada:\n ");
            System.out.println("1 - Cadastro\n");
            System.out.println(("2 - Busca\n "));
            System.out.println(("3 - Atualize o ano letivo\n"));
            System.out.println("4 - Sair do Sistema\n");
            acao = sc.nextInt();

            switch (acao){
                case 1:
                    System.out.println("Cadastro");
                    Cadastro cadastro = new Cadastro();
                    Aluno aluno = cadastro.criarAluno();
                    System.out.println("Aluno cadastrado com sucesso!");
                    System.out.println("Nome: " + aluno.getNome());
                    System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
                    System.out.println("Naturalidade: " + aluno.getNaturalidade());
                    System.out.println("Responsável: " + aluno.getResponsavel().getNome());
                    break;
                case 2:
                    System.out.println("Busca");
                    break;
                case 3:
                    System.out.println("Atualizou");
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:

                    System.out.println("Opção Invalida");
            }

        }while(acao!=4);


        sc.close();
    }
}