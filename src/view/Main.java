package view;

import model.Pessoa;

//Classe main com teste do get e set da classe pessoa usando atributo nome, funcionando normal.
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Henrick");

        System.out.println("Nome: " + p1.getNome());

    }
}