import java.util.Scanner;

public class SomaDivisores {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Insira um número:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos divisores de " + n + " é: " + soma);
    }
}
