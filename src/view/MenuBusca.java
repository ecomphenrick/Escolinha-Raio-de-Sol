package view;

import model.Escola;
import model.Turma;

import java.util.List;
import java.util.Scanner;

public class MenuBusca {
    Scanner sc = new Scanner(System.in);
    public void ExibirMenu(Escola escola) {
        List<Turma> turmas = escola.getTurmas();
        int acao;
        do {
            System.out.println("Você deseja buscar: ");
            System.out.println("0 - Aluno");
            System.out.println("1 - Professor");
            System.out.println("2 - Turma");
            System.out.println("3 - Sair");
            acao = sc.nextInt();
            sc.nextLine();
            switch (acao) {
                case 0:
                    //Ver como buscar aluno, talvez por nome??
                    break;
                case 1:
                    //Ver como implementar.
                    break;
                case 2:
                    if(escola.getTurmas()==null || escola.getTurmas().isEmpty()){
                        System.out.println("Não existem turmas cadastradas.");
                    }else{
                        System.out.println("0 - Ler");
                        System.out.println("1 - Atualizar");
                        System.out.println("2 - Deletar");
                        System.out.println("3 - Sair");
                        int acaoTurma = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Em qual turma? ");
                        for (int i = 0; i < turmas.size(); i++) {
                            Turma t = turmas.get(i);
                            System.out.println(i + ": " + t.getSerie() + " - " + t.getAnoLetivo());}
                        System.out.println("Escolha a turma: ");
                        int escolhaTurma = sc.nextInt();
                        sc.nextLine();
                        Turma turmaEscolhida = turmas.get(escolhaTurma);
                        switch (acaoTurma){
                            case 0:
                                MenuRUD menuRUD = new MenuRUD();
                                menuRUD.ExibirLer(escola, turmaEscolhida);
                                break;
                            case 1:
                                //implementar atualizar;
                                break;
                            case 2:
                                escola.getTurmas().remove(turmaEscolhida);
                        }
                    }

                    break;
                case 3:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção Inválida. ");
                    break;

            }
        } while (acao != 3);


    }
}
