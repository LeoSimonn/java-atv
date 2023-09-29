package Java;
import java.util.Scanner;

public class triangPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        int n = sc.nextInt();

        int cont = 2; // Começamos com o primeiro número par

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(cont + " ");
                cont += 2; // Incrementa para o próximo número par
            }
            System.out.println(); // Muda para a próxima linha
        }
    }
}

    
