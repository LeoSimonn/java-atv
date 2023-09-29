package Java;
import java.util.Scanner;


public class preProva {
    
    public static void main(String[] args){

    
    Scanner sc = new Scanner(System.in);

    int n = 0;
    int prodImpar = 1;
    int cont = 0;

    System.out.println("Insira um número inteiro");
    n = sc.nextInt();

    for(int i = 1; cont < n ; i++){

        if(i % 2 != 0){ // i é ímpar
        cont++;
        prodImpar = prodImpar * i;
        }
        
        if(cont == n){
            System.out.println("O produto dos números ímpares é: " + prodImpar);
            break;
        }

    }
        
    }
}