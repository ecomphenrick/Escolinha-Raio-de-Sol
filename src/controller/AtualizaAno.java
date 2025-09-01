package controller;

import model.Escola;
import model.Turma;
import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AtualizaAno {
    public void atualizarAno(Escola escola) {
        List<Turma> turmas = escola.getTurmas();
        List<Turma> novasTurmas = new ArrayList<>();

        for (Turma turmaAntiga : turmas) {
            int novaSerie = turmaAntiga.getSerie() + 1;
            int novoAnoLetivo = turmaAntiga.getAnoLetivo() + 1;
            
            if (novaSerie <= 9) {
                List<Aluno> mesmosAlunos = turmaAntiga.getAlunos();

                Turma novaTurma = new Turma(
                        novaSerie,
                        novoAnoLetivo,
                        turmaAntiga.getProfessor(),
                        mesmosAlunos
                );


                novasTurmas.add(novaTurma);
            } else {
                System.out.println("Turma do 9º ano " + turmaAntiga.getAnoLetivo() + " se formou!");
            }
        }

        turmas.addAll(novasTurmas);
    }
}



