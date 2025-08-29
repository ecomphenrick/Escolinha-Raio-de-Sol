package view;

import controller.Cadastro;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCadastro {
    Scanner sc = new Scanner(System.in);
    Cadastro cadastro = new Cadastro();


    public void ExibirMenu(Escola escola) {
        int acaoCadastro;
        List<Turma> turmas = escola.getTurmas();
        System.out.println("Cadastro: ");
        do {
            System.out.println("Digite a opção desejada: ");
            System.out.println("0 - Cadastrar Aluno");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Turma");
            System.out.println("3 - Não cadastrar Ninguém");
            acaoCadastro = sc.nextInt();
            sc.nextLine();

            switch (acaoCadastro) {
                case 0:

                    if (escola.getTurmas() == null || escola.getTurmas().isEmpty()) {
                        System.out.println("Não há turmas cadastradas, cadastre uma antes.");
                    } else {
                        System.out.println("Cadastrando Aluno.");
                        System.out.println("Digite o nome do aluno: ");
                        String nomeAluno = sc.nextLine();
                        System.out.println("Data de Nascimento: ");
                        String dataNascimentoAluno = sc.nextLine();
                        System.out.println("Cadastrando Endereço: ");
                        System.out.println("Rua: ");
                        String rua = sc.nextLine();
                        System.out.println("Bairro: ");
                        String bairro = sc.nextLine();
                        System.out.println("CEP: ");
                        String cep = sc.nextLine();
                        System.out.println("Cidade: ");
                        String cidade = sc.nextLine();
                        System.out.println("Estado: ");
                        String estado = sc.nextLine();
                        Endereco endereco = new Endereco(rua, bairro, cep, cidade, estado);
                        System.out.println("Digite a Naturalidade: ");
                        String naturalidade = sc.nextLine();
                        System.out.println("Qual Turma? ");
                        for (int i = 0; i < turmas.size(); i++) {
                            Turma t = turmas.get(i);
                            System.out.println(i + " - " + t.getSerie() + " - " + t.getAnoLetivo());
                        }
                        int escolha = sc.nextInt();
                        sc.nextLine();
                        Turma turma = turmas.get(escolha);

                        System.out.println("Cadastrando Responsável: ");
                        System.out.println("Nome Responsável: ");
                        String nomeResp = sc.nextLine();
                        System.out.println("Data de Nascimento Responsável: ");
                        String dataResp = sc.nextLine();
                        System.out.println("Telefone: ");
                        String telefone = sc.nextLine();
                        List<Aluno> dependentes = new ArrayList<>();

                        Responsavel responsavel = new Responsavel(nomeResp, dataResp, endereco, telefone, dependentes);

                        cadastro.CadastroAluno(escola, nomeAluno, dataNascimentoAluno, endereco, naturalidade, responsavel, turma);

                    }
                    break;
                case 1:
                    System.out.println("Cadastrando Professor");
                    turmas = escola.getTurmas();
                    System.out.println("Cadastrando Professor.");
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Data de Nascimento: ");
                    String dataNascimento = sc.nextLine();
                    System.out.println("Cadastrando Endereço: ");
                    System.out.println("Rua: ");
                    String rua = sc.nextLine();
                    System.out.println("Bairro: ");
                    String bairro = sc.nextLine();
                    System.out.println("CEP: ");
                    String cep = sc.nextLine();
                    System.out.println("Cidade: ");
                    String cidade = sc.nextLine();
                    System.out.println("Estado: ");
                    String estado = sc.nextLine();
                    Endereco endereco = new Endereco(rua, bairro, cep, cidade, estado);
                    System.out.println("Formação: ");
                    String formacao = sc.nextLine();
                    System.out.println("Qual Turma? ");
                    for (int i = 0; i < turmas.size(); i++) {
                        Turma t = turmas.get(i);
                        System.out.println(i + " - " + t.getSerie() + " - " + t.getAnoLetivo());
                    }
                    int escolha = sc.nextInt();
                    Turma turma = turmas.get(escolha);
                    System.out.println("Telefone: ");
                    String telefone = sc.nextLine();
                    List<Aluno> dependentes = new ArrayList<>();

                    cadastro.CadastroProfessor(escola, nome, dataNascimento, endereco, formacao,turma,telefone,dependentes);
                    break;
                case 2:
                    System.out.println("Cadastrando Turma.");
                    System.out.println("Digite a série: ");
                    String serie = sc.nextLine();
                    System.out.println("Digite o ano letivo: ");
                    String anoLetivo = sc.nextLine();
                    System.out.println("Digite o professor: ");
                    String professorTurma = sc.nextLine();
                    List<Aluno> alunos = new ArrayList<>();


                    cadastro.CadastroTurma(escola, serie, anoLetivo, professorTurma, alunos);
                    break;
                case 3:
                    System.out.println("Ninguém Cadastrado.");
                    break;
            }

        } while (acaoCadastro != 3);
    }
}