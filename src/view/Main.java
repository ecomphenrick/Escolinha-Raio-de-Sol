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
                    int acaoCadastro;
                    System.out.println("Cadastro: ");
                    do{
                        System.out.println("Digite a opção desejada: ");
                        System.out.println("1 - Cadastrar Aluno");
                        System.out.println("2 - Cadastrar Professor");
                        System.out.println("3 - Cadastrar Professor");
                        System.out.println("4 - Não cadastrar Ninguém");
                        acaoCadastro = sc.nextInt();
                        switch (acaoCadastro){
                            case 1:
                                Cadastro cadastro = new Cadastro();
                                cadastro.CadastroAluno();

                        }


                    }while(acaoCadastro!=4);
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