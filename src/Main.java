import model.Aluno;
import model.Escola;
import model.Turma;
import view.MenuBusca;
import view.MenuCadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Escola escola = new Escola();
        System.out.println("Bem vindos a Escola Raio de Sol!");
        int acao;
        do {
            System.out.println("0 - Cadastro");
            System.out.println("1 - Busca");
            System.out.println("2 - Atualizar Ano"); //Ver como implementar.
            System.out.println("3 - Sair");
            acao = sc.nextInt();

            switch (acao){
                case 0:
                    MenuCadastro menuCadastro = new MenuCadastro();
                    menuCadastro.ExibirMenu(escola);
                    break;
                case 1:
                    MenuBusca menuBusca = new MenuBusca();
                    //menuBusca chamada;
                    break;
                case 2:
                    //Ver como implementar
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida, selecione outra!");
                    break;
            }

        } while (acao != 3);
        
    }

}
