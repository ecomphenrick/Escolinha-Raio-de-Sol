package controller;

import model.Aluno;
import model.Boletim;
import model.Turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Classe para cadastro
public class Cadastro {
    public Aluno criarAluno() {
        Scanner sc = new Scanner(System.in);


        // Dados básicos
        System.out.print("Digite o nome do Aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a data de nascimento: ");
        String dataNascimento = sc.nextLine();

        // Endereço
        System.out.println("Digite o endereço:");
        System.out.print("Rua: ");
        String rua = sc.nextLine();
        System.out.print("Bairro: ");
        String bairro = sc.nextLine();
        System.out.println("CEP: ");
        String cep = sc.nextLine();
        System.out.println("Cidade: ");
        String cidade = sc.nextLine();
        System.out.println("Estado: ");
        String estado = sc.nextLine();
        model.Endereco endereco = new model.Endereco(rua, bairro, cep, cidade, estado);

        System.out.print("Digite a naturalidade: ");
        String naturalidade = sc.nextLine();



        // Responsável
        System.out.println("Digite os dados do responsável:");
        System.out.print("Nome: ");
        String nomeResp = sc.nextLine();
        System.out.println("Data de Nascimento: ");
        String dataNascimentoResp = sc.nextLine();
        System.out.print("Telefone: ");
        String telefoneResp = sc.nextLine();
        List<Aluno> dependentes = new ArrayList<>();
        model.Responsavel responsavel = new model.Responsavel(nomeResp, dataNascimentoResp, endereco, telefoneResp, dependentes);

// Pergunta a série e o ano letivo
        System.out.print("Digite a série do aluno: ");
        String serie = sc.nextLine();

        System.out.print("Digite o ano letivo: ");
        String anoLetivo = sc.nextLine();

// Para simplificar, inicialmente não atribuímos professor
        model.Professor professor = null;

// Lista vazia de alunos e boletins
        List<Aluno> alunos = new ArrayList<>();
        List<Boletim> boletins = new ArrayList<>();

// Cria a Turma com todos os atributos
        Turma turma = new Turma(serie, anoLetivo, professor, alunos, boletins);

        List<Boletim> boletin = new ArrayList<>();

        // Cria o objeto Aluno **somente aqui**
        Aluno aluno = new Aluno(nome, dataNascimento, endereco, naturalidade, responsavel, turma, boletin);

        // Adiciona o aluno na lista de dependentes do responsável
        dependentes.add(aluno);

        return aluno;
    }
}
