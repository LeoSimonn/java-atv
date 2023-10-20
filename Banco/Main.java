package Banco;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double saldoInicial = 0;
    double rendimentoMensalPercentual = 0;
    double aporteMensal = 0;
    int opcao = 0;

    System.out.println("Bem vindo ao C6 Bank");
    System.out.println("Insira o seu valor inicial:");
    saldoInicial = scanner.nextDouble();

    System.out.println("Insira o rendimento mensal desejado:");
    rendimentoMensalPercentual = scanner.nextDouble();

    System.out.println("Insira o valor do seu aporte mensal:");
    aporteMensal = scanner.nextDouble();

    ContaBancaria conta = new ContaBancaria(saldoInicial, rendimentoMensalPercentual);

    System.out.println("Seu saldo inicial é de: " + conta.saldo);
    System.out.println("Você tem as seguinte opções para escolher:");
    System.out.println("1. Depositar");
    System.out.println("2. Sacar");
    System.out.println("3. Calcular rendimento mensal sem aporte");
    System.out.println("4. Calcular rendimento mensal com aporte");
    System.out.println("5. Previsão de rendimento mensal");
    System.out.println("6. Sair");

    opcao = scanner.nextInt();

    switch(opcao){
        case 1:
            System.out.println("Insira o valor do seu deposito:");
            double valorDeposito = scanner.nextDouble();
            conta.depositar(valorDeposito);
            break;
        case 2:
            System.out.println("Insira o valor do seu saque:");
            double valorSaque = scanner.nextDouble();
            if(valorSaque > conta.saldo){
                System.out.println("Saldo insuficiente");
            }else{
                conta.sacar(valorSaque);
            }
            break;
        case 3:
            conta.calcularRendimentoMensal();
            System.out.println("Seu saldo atual é de: " + conta.saldo);
            break;
        case 4:
            System.out.println("Insira o numero de meses:");
            int meses = scanner.nextInt();
            conta.previsaoRendimentoMensalComAporte(aporteMensal, meses);
            
            


    }










    }
}
