import controller.Cadastro;
import model.Escola;
import model.Aluno;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Escola escola = new Escola();
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
                        System.out.println("3 - Cadastrar Turma");
                        System.out.println("4 - Não cadastrar Ninguém");
                        acaoCadastro = sc.nextInt();
                        switch (acaoCadastro){
                            case 1:
                                if(escola.getTurmas() == null || escola.getTurmas().isEmpty())
                                {
                                    System.out.println("Nenhuma turma está cadastrada.");
                                    System.out.println(("Cadastre uma turma antes."));

                                }else {
                                    Cadastro cadastroAluno = new Cadastro();
                                    cadastroAluno.CadastroAluno(escola);
                                }
                                break;
                            case 2:
                                Cadastro cadastroProfessor = new Cadastro();
                                cadastroProfessor.CadastroProfessor(escola);
                            case 3:
                                Cadastro cadastroTurma = new Cadastro();
                                cadastroTurma.CadastroTurma(escola);
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