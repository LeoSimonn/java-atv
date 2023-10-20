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
public String getNome() {
    return this.nome;
}

public int getIdade() {
    return this.idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public String aniversario() {
    this.idade++;
    return "Parabéns " + this.nome + " pelos seus " + this.idade + " anos de vida!";
}
}