package model;

public class Pessoa {
    protected String nome;
    protected String dataNascimento;
    protected Endereco endereco;

    public Pessoa (String nome){
        this.nome = nome;

    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}

//Classe Pessoa feita, com os getter e setter do nome pessoa, implementar o restante.
