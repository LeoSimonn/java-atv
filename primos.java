import java.util.Scanner;

public class primos{

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Vamos comparar números primos!");
    System.out.println("Insira um número");

    int num = sc.nextInt();

    // Regras dos números primos

    while (num >= 2) {
        while (num % 2 == 0) {
            System.out.println("O número " + num + " não é primo");
            break;
    }
 
}

}

}










