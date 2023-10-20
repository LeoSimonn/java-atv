package Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Calculadora calc = new Calculadora();

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Iniciando calculadora...");
    System.out.println("Insira o primeiro número: ");
    double num1 = sc.nextDouble();
    System.out.println("Insira o segundo número: ");
    double num2 = sc.nextDouble();
    System.out.println("Insira a operação: ");
    String operacao = sc.next();

    if(operacao.equals("mais")){
        System.out.println(calc.soma());
          
    } else if(operacao.equals("menos")){
       // Calculadora calc = new Calculadora(num1, num2, operacao);
       // System.out.println(calc.subtracao());   
    } else if(operacao.equals("mult")){
       // Calculadora calc = new Calculadora(num1, num2, operacao);
       // System.out.println(calc.multiplicacao());   
    } else if(operacao.equals("div")){
       // Calculadora calc = new Calculadora(num1, num2, operacao);
       // System.out.println(calc.divisao());   
    } else if(operacao.equals("expo")){
       // Calculadora calc = new Calculadora(num1, num2, operacao);
       // System.out.println(calc.potencia());   
    } else if(operacao.equals("raiz")){
      //  Calculadora calc = new Calculadora(num1, num2, operacao);
       // System.out.println(calc.raiz());   
    } else if(operacao.equals("fat")){
      //  Calculadora calc = new Calculadora(num1, num2, operacao);
      //  System.out.println(calc.fatorial());
    }


    }

    
}
