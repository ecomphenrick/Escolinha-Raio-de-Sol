package controller;


import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Classe para cadastro
public class Cadastro {
    public void CadastroAluno(Escola escola, String nome, String dataNascimento, Endereco endereco, String naturalidade, Responsavel responsavel, Turma turma) {

        Aluno aluno = new Aluno(nome, dataNascimento, endereco, naturalidade, responsavel, turma);

        turma.getAlunos().add(aluno);
        escola.getAlunos().add(aluno);

        System.out.println("Aluno Cadastrado.");

    }

    public Turma CadastroTurma(Escola escola, String serie, String anoLetivo, Professor professor, List<Aluno> alunos) {
        Turma turmaCriada = new Turma(serie, anoLetivo, professor, alunos);

        escola.getTurmas().add(turmaCriada);
        System.out.println("Turma Cadastrada.");


        return turmaCriada;
    }

    public Professor CadastroProfessor(Escola escola, String nome, String dataNascimento, Endereco endereco, String formacao, Turma turma, String telefone, List<Aluno> dependente) {
        Professor professor = new Professor(nome, dataNascimento, endereco, formacao, turma, telefone, dependente);
        escola.getProfessores().add(professor);
        System.out.println("Professor cadastrado.");


        return professor;
    }
}
