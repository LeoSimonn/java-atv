import java.util.Scanner;

public class desafio {
    
    public static void main(String[] args) {
        int x = 0;
        int cont = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        x = sc.nextInt();

        do {
            if(x % 2 == 0) {
                System.out.println("Par");
                x = x / 2;
            } else {
                System.out.println("Ímpar");
                x = (x * 3) + 1;
            }
            cont++;
        } while(x != 1);

        System.out.println("O número de passos foi: " + cont);
    }
}
