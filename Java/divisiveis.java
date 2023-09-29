import java.util.Scanner;

public class divisiveis {
    
 public static int contarDivisiveis(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[]args){

   Scanner scanner = new Scanner(System.in);

    // Exercício 2: Contagem de Divisíveis
    System.out.print("Digite um número N para contar os divisíveis por 3 e 5: ");
    int numDivisiveis = contarDivisiveis(scanner.nextInt());
    System.out.println("Quantidade de números divisíveis por 3 e 5 de 1 a N: " + numDivisiveis);

    }

}
