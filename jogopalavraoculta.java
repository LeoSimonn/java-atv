import java.util.Scanner;

public class jogopalavraoculta{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = "banana";
        String palavraOculta = "";
        
        int tamanho = palavra.length();
        int i = 0;
        
        while(i < tamanho) {
            palavraOculta = palavraOculta + "_";
            i++;
        }

        System.out.println(palavraOculta);

        System.out.println("Digite uma letra: ");
        String letra = sc.next();

        for(i = 0; i < tamanho; i++) {
            if(palavra.charAt(i) == letra.charAt(0)) {
                palavraOculta = palavraOculta.substring(0, i) + letra + palavraOculta.substring(i + 1);
            }




        }
            

        }


    }




