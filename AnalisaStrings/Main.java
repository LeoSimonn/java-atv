package AnalisaStrings;

public class Main {
    
public static void main(String[] args) {

AnalisaString analizador = new AnalisaString();

System.out.println(analizador.comecaCom("joao", "jo"));

System.out.println(analizador.palindromo("arara", "bola"));

System.out.println(analizador.strTerminaComSegunda("bananad","banana"));

System.out.println(analizador.iguaisOuNao("jun", "jun"));
}
}
