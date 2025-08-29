package view;

import controller.Cadastro;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCadastro {
    //Criando Objetos
    Scanner sc = new Scanner(System.in);
    Cadastro cadastro = new Cadastro();


    //Exibição do menu de cadastro com as chamadas de métodos.
    public void ExibirMenu(Escola escola) {
        int acaoCadastro;
        List<Turma> turmas = escola.getTurmas();
        System.out.println("Cadastro: ");
        do {
            System.out.println("Digite a opção desejada: ");
            System.out.println("0 - Cadastrar Aluno");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Turma");
            System.out.println("3 - Sair");
            acaoCadastro = sc.nextInt();
            sc.nextLine();

            switch (acaoCadastro) {
                case 0:

                    if (escola.getTurmas() == null || escola.getTurmas().isEmpty()) { //Verifica se existem turmas cadastradas.
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
                    System.out.println("Telefone: ");
                    String telefone = sc.nextLine();
                    List<Aluno> dependentes = new ArrayList<>();

                    Professor novoProfessor;


                    if(escola.getTurmas()==null || escola.getTurmas().isEmpty()){
                        novoProfessor = cadastro.CadastroProfessor(escola, nome, dataNascimento, endereco, formacao,null,telefone,dependentes);
                        escola.adicionarProfessorSemTurma(novoProfessor);
                        System.out.println("Professor sem turma");
                    }else{
                        System.out.println("Qual Turma? ");

                        for (int i = 0; i < turmas.size(); i++) {
                            Turma t = turmas.get(i);
                            System.out.println(i + " - " + t.getSerie() + " - " + t.getAnoLetivo());
                        }
                        int escolha = sc.nextInt();
                        sc.nextLine();
                        Turma turma = turmas.get(escolha);
                        novoProfessor = cadastro.CadastroProfessor(escola, nome, dataNascimento, endereco, formacao, turma, telefone, dependentes);
                        turma.setProfessor(novoProfessor);
                        System.out.println("Professor vinculado a turma.");
                    }
                    break;
                case 2:
                    System.out.println("Cadastrando Turma.");
                    System.out.println("Digite a série: ");
                    String serie = sc.nextLine();
                    System.out.println("Digite o ano letivo: ");
                    String anoLetivo = sc.nextLine();

                    Professor professorTurma = null;

                    if(!escola.getProfessoresSemTurma().isEmpty()){
                        System.out.println("Professores disponíveis:");
                        List<Professor> disponiveis = escola.getProfessoresSemTurma();
                        for(int i = 0; i < disponiveis.size(); i++){
                            System.out.println(i + " - " + disponiveis.get(i).getNome());
                        }
                        int escolhaProf = sc.nextInt();
                        sc.nextLine();
                        professorTurma = disponiveis.get(escolhaProf);
                        escola.getProfessoresSemTurma().remove(professorTurma);
                    } else {
                        System.out.println("Nenhum professor disponível");
                    }

                    List<Aluno> alunos = new ArrayList<>();
                    Turma novaTurma = cadastro.CadastroTurma(escola, serie, anoLetivo, professorTurma, alunos);

                    if(professorTurma != null){
                        professorTurma.setTurma(novaTurma);
                        novaTurma.setProfessor(professorTurma);
                    }
                    break;

                case 3:
                    System.out.println("Sair.");
                    break;
            }

        } while (acaoCadastro != 3);
    }
}