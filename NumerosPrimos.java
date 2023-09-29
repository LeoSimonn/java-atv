import java.lang.Math;

public class NumerosPrimos {
    public static void main(String[] args) {
        int n = 10; // Número de números primos desejados
        int contador = 0;
        int numeroAtual = 2;

        System.out.println("Os primeiros " + n + " números primos são:");

        while (contador < n) {
            if (ehPrimo(numeroAtual)) {
                System.out.print(numeroAtual + " ");
                contador++;
            }
            numeroAtual++;
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
