import java.util.Scanner;

public class forca {

    public static void main(String[] args) {
        String input = "banana";

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = sc.next();


        String result = addCharIfNotPresent(input, letra.charAt(0));
        System.out.println(result); // Deve imprimir "HelloWorlda" pois 'a' não estava na string original
    }

    public static String addCharIfNotPresent(String s, char charToInsert) {
        // Verifica se o caractere já está na string
        if (!s.contains(String.valueOf(charToInsert))) {
            s += charToInsert;
        }
        return s;
    }
}
