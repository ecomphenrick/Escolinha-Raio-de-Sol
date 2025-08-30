import model.Aluno;
import model.Escola;
import model.Professor;
import model.Turma;
import view.MenuBusca;
import view.MenuCadastro;

import java.util.List;
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
                    menuBusca.ExibirMenu(escola);
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
        List<Professor> professores = escola.getProfessores();

        //Testes para saber se os objetos estavam sendo adicionados nas listas.
        if(professores != null && !professores.isEmpty()) {
            for(Professor prof : professores) {  // for-each
                System.out.println("Nome: " + prof.getNome());
                System.out.println("Formação: " + prof.getFormacao());
                if(prof.getTurma() != null){
                    System.out.println("Turma: " + prof.getTurma().getSerie() + " - " + prof.getTurma().getAnoLetivo());
                } else {
                    System.out.println("Sem turma");
                }
                System.out.println("----------------------");
            }
        } else {
            System.out.println("Nenhum professor cadastrado.");
        }
        List<Aluno> alunos = escola.getAlunos();
        if(alunos != null && !alunos.isEmpty()) {
            for(Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Data Nascimento: " + aluno.getDataNascimento());
                System.out.println("Turma: " + aluno.getTurma().getSerie() + " - " + aluno.getTurma().getAnoLetivo());
                System.out.println("----------------------");
            }
        } else {
            System.out.println("Nenhum aluno cadastrado.");
        }
        List<Turma> turmas = escola.getTurmas();
        if(turmas != null && !turmas.isEmpty()) {
            for(Turma turma : turmas) {
                System.out.println("Série: " + turma.getSerie());
                System.out.println("Ano Letivo: " + turma.getAnoLetivo());
                if(turma.getProfessor() != null) {
                    System.out.println("Professor: " + turma.getProfessor().getNome());
                } else {
                    System.out.println("Sem professor");
                }
                System.out.println("Alunos:");
                for(Aluno aluno : turma.getAlunos()) {
                    System.out.println(" - " + aluno.getNome());
                }
                System.out.println("----------------------");
            }
        } else {
            System.out.println("Nenhuma turma cadastrada.");
        }

    }

}
