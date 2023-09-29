package Java;
import java.util.Scanner;

   public class sistDescontos{

    public static double descontos(double valor){

        double valorFinal = 0;

        if (valor > 100){
            double x = valor * 0.05;
            valorFinal = valor - x;
            System.out.println("O valor do seu produto com desconto é: R$" + valorFinal);
        }else if (valor > 200){
            double x = valor * 0.10;
            valorFinal = valor - x;
            System.out.println("O valor do seu produto com desconto é: R$" + valorFinal);
        }else if (valor > 300){
            double x = valor * 0.15;
            valorFinal = valor - x;
            System.out.println("O valor do seu produto com desconto é: R$" + valorFinal);
        }else{
            System.out.println("Você não tem desconto");
            System.out.println("O valor do seu produto é: R$" + valor);
        }
        
        return valorFinal;
    }

    public static double frete(String regiao, double valorFinal){

        if (regiao.equals("norte") || regiao.equals("Norte")){
            System.out.println("O valor do seu frete é: R$40");
            valorFinal = valorFinal + 40;
            System.out.println("O valor final da sua compra é: R$" + valorFinal);
        }else if (regiao.equals("nordeste") || regiao.equals("Nordeste")){
            System.out.println("O valor do seu frete é: R$25");
            valorFinal = valorFinal + 25;
            System.out.println("O valor final da sua compra é: R$" + valorFinal);
        }else if (regiao.equals("centro-oeste") || regiao.equals("Centro-oeste")){
            System.out.println("O valor do seu frete é: R$15");
            valorFinal = valorFinal + 15;
            System.out.println("O valor final da sua compra é: R$" + valorFinal);
        }else if(regiao.equals("sudeste") || regiao.equals("Sudeste")){
            System.out.println("O valor do seu frete é: R$10");
            valorFinal = valorFinal + 10;
            System.out.println("O valor final da sua compra é: R$" + valorFinal);
        }

        return valorFinal;

    }

        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seja bem vindo a nossa loja!!!");

        System.out.println("Insira o valor do seu produto:");
        double valor = sc.nextDouble();

        double valorFinal = descontos(valor);

        System.out.println("Insira a região de entrega:");
        String regiao = sc.next();

        valorFinal = frete(regiao, valorFinal);

        }

    }

