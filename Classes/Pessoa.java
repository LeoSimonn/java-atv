package Classes;

public class Pessoa {
    

// Atributos ou Propriedades

private String nome;
private int idade;
private double altura;
private String cpf;
private boolean tomacafe;

// Construtor

public Pessoa(String nome, int idade, double altura, String cpf, boolean tomacafe) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.cpf = cpf;
    this.tomacafe = tomacafe;
}


// Métodos ou Comportamentos
public String respondeNome() {
    return this.nome;
}
}