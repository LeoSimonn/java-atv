package RPG;
import java.util.Random;

// Atributos ou Propriedades

public class Personagem{

    private Random random = new Random();

    String nome = "Elion";
    int forca = 10;
    int vida = 10;
    int resistencia = 10;
    int inteligencia = 10;
    int magia = 10;


// Construtor

public Personagem(String nome, int forca, int resistencia, int inteligencia){
    this.nome = nome;
    this.forca = forca;
    this.vida = this.resistencia * 10;
    this.resistencia = resistencia;
    this.inteligencia = inteligencia;
    this.magia = this.inteligencia * 10;

}

// Metodos ou Comportamentos

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}

public void setForca(int forca){
    this.forca = forca;
}

public int getForca(){
    return this.forca;
}

public void setVida(int vida){
    this.vida = vida;
}

public int getVida(){
    return this.vida;
}

public void setResistencia(int resistencia){
    this.resistencia = resistencia;
}

public int getResistencia(){
    return this.resistencia;
}

public void setInteligencia(int inteligencia){
    this.inteligencia = inteligencia;
}

public int getInteligencia(){
    return this.inteligencia;
}

public void setMagia(int magia){
    this.magia = magia;
}

public int getMagia(){
    return this.magia;
}

// Métodos ou Comportamentos

public int gerarNumeroAleatorio10(){
    return random.nextInt(10);
}

public int gerarNumeroAleatorio20(){
    return random.nextInt(20);
}

public int atacar(){
forca = forca * gerarNumeroAleatorio10();
return forca;
}

public String moverParaFrente(){
    return "Elion anda para frente";
}

public String receberDano(){
    return "Elion está com" + vida + "pontos de vida";

}

public String bolaDeFogo(){
    int dano = 0;
    magia = magia - 10;
    dano = inteligencia * gerarNumeroAleatorio20();
    return "Elion lançou uma bola de fogo e causou" + dano + "de dano";

}


}