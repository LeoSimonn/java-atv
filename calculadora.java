import java.util.Scanner;

public class calculadora {
    

    public static double soma(double x, double y){

        double resultado = x + y;
        return resultado;

    }

    public static double sub(double x, double y){

        double resultado = x - y;
        return resultado;

    }
    
    public static double div(double x, double y){

        double resultado = x / y;
        return resultado;
    
    }
        
    public static double mult(double x, double y){

        double resultado = x * y;
        return resultado;
        
    }
    
    public static void main(String[] args) {
    
    double x = 0;
    double y = 0;
    int op = 0;

    System.out.println("Iniciando calculadora...");

    Scanner sc = new Scanner(System.in);
  
    System.out.println("Insira um número");
    x = sc.nextDouble();

    System.out.println("Insira outro número");
    y = sc.nextDouble();

    System.out.println("Insira a operação que deseja realizar:");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    
    op = sc.nextInt();

    switch(op){
        case 1:
            System.out.println(soma(x, y));
            break;
        case 2:
            System.out.println(sub(x, y));
            break;
        case 3:
            System.out.println(mult(x, y));
            break;
        case 4:
            System.out.println(div(x, y));
            break;
        default:
            System.out.println("Operação inválida");
            break;
    }

    
    }

}