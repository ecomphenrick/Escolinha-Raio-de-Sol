package controller;


import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Classe para cadastro
public class Cadastro {
    Scanner sc = new Scanner(System.in);
    public void CadastroAluno(Escola escola){
        List<Turma> turmas = escola.getTurmas();
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
        for(int i=0; i< turmas.size(); i++){
            Turma t = turmas.get(i);
            System.out.println(i+" - " + t.getSerie() + " - " + t.getAnoLetivo());
        }
        int escolha = sc.nextInt();
        Turma turma = turmas.get(escolha);

        System.out.println("Cadastrando Responsável: ");
        System.out.println("Nome Responsável: ");
        String nomeResp = sc.nextLine();
        System.out.println("Data de Nascimento Responsável: ");
        String dataResp = sc.nextLine();
        System.out.println("Telefone: ");
        String telefone = sc.nextLine();
        List<Aluno> dependentes = new ArrayList<>();
        List<Boletim> boletim = new ArrayList<>();

        Responsavel responsavel = new Responsavel(nomeResp, dataResp, endereco, telefone, dependentes );

        Aluno aluno = new Aluno(nomeAluno, dataNascimentoAluno, endereco, naturalidade, responsavel, turma, boletim);

        dependentes.add(aluno);
        turma.getAlunos().add(aluno);

        System.out.println("Aluno Cadastrado.");

        //oq retorno? onde guardo esse aluno?

    }
    public void CadastroTurma(Escola escola){
        System.out.println("Cadastrando Turma.");
        System.out.println("Digite a série: ");
        String serie = sc.nextLine();
        System.out.println("Digite o ano letivo: ");
        String anoLetivo = sc.nextLine();
        System.out.println("Digite o professor: ");
        String professor = sc.nextLine();
        List<Aluno> alunos = new ArrayList<>();
        List<Boletim> boletins = new ArrayList<>();


        Turma turma = new Turma(serie, anoLetivo, professor, alunos, boletins);

        escola.getTurmas().add(turma);

    }
    public void CadastroProfessor(Escola escola){
        List<Turma> turmas = escola.getTurmas();
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
        for(int i=0; i< turmas.size(); i++){
            Turma t = turmas.get(i);
            System.out.println(i+" - " + t.getSerie() + " - " + t.getAnoLetivo());
        }
        int escolha = sc.nextInt();
        Turma turma = turmas.get(escolha);
        System.out.println("Telefone: ");
        String telefone = sc.nextLine();
        List<Aluno> dependentes = new ArrayList<>();






        Professor professor = new Professor(nome, dataNascimento, endereco, formacao, turma, telefone, dependentes);

    }
}
