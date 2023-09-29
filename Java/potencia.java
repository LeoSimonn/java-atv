package Java;
import java.util.Scanner;
import java.lang.Math;

public class potencia {

    public static int calcPotencia(int x, int y){

        int potencia = (int) Math.pow(x, y);
        System.out.println("O resultado da potência é: " + potencia);
        return potencia;

    }


    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número inteiro");
    int x = scanner.nextInt();
    System.out.println("Digite um segundo número inteiro");
    int y = scanner.nextInt();
    
    calcPotencia(x, y);


    }


}
