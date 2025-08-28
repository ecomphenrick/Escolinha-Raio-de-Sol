package controller;


import model.Aluno;
import model.Boletim;
import model.Endereco;
import model.Responsavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Classe para cadastro
public class Cadastro {
    public void CadastroAluno(){
        Scanner sc = new Scanner(System.in);
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
        String turma = sc.nextLine();
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

        System.out.println("Aluno Cadastrado.");

    }
}
