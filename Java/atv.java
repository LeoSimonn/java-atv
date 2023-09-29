package Java;
//import java.util.Scanner;

//public class atv{
    /*public static void main(String[] args){

        System.out.println("Insira uma senha de no mínimo 8 caracteres");
        System.out.println("A senha não deve conter $, -, *, @, # e %");
        System.out.println("A senha deve ser uma string");

        Scanner sc = new Scanner(System.in);
        String senha = sc.nextLine();

        if(senha.length() < 8){
            System.out.println("Senha inválida");
        }else if(senha.contains("$") || senha.contains("-") || senha.contains("*") || senha.contains("@") || senha.contains("#") || senha.contains("%")){
            System.out.println("Senha inválida");
        }else{
            System.out.println("Senha válida");
        }
    }
    }
        // -- Adivinhe o número --
        /*
        int numeroCorreto = 22;

        System.out.println("Insira um número de 1 a 100");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n != numeroCorreto){
            System.out.println("Insira um número de 1 a 100");
            n = sc.nextInt();
        

        if(n == numeroCorreto){
            System.out.println("Você acertou!");
        }else if(n > numeroCorreto){
            System.out.println("Você errou, o número é menor");
        }else if(n < numeroCorreto){
            System.out.println("Você errou, o número é maior");
        }else{ 
            System.out.println("Número inválido");
        }

        if(n < 10 && numeroCorreto < 10){
            System.out.println("O número é menor que 10");
        }else if(n > 10 && numeroCorreto > 10){
            System.out.println("O número é maior que 10");
        }else if(n < 20 && numeroCorreto < 20){
            System.out.println("O número é menor que 20");
        }else if(n > 20 && numeroCorreto > 20){
            System.out.println("O número é maior que 20");
        }else if(n < 30 && numeroCorreto < 30){
            System.out.println("O número é menor que 30");
        }else if(n > 30 && numeroCorreto > 30){
            System.out.println("O número é maior que 30");
        }else if(n < 40 && numeroCorreto < 40){
            System.out.println("O número é menor que 40");
        }else if(n > 40 && numeroCorreto > 40){
            System.out.println("O número é maior que 40");
        }else if(n < 50 && numeroCorreto < 50){
            System.out.println("O número é menor que 50");
        }else if(n > 50 && numeroCorreto > 50){
            System.out.println("O número é maior que 50");
        }else if(n < 60 && numeroCorreto < 60){
            System.out.println("O número é menor que 60");
        }else if(n > 60 && numeroCorreto > 60){
            System.out.println("O número é maior que 60");
        }else if(n < 70 && numeroCorreto < 70){
            System.out.println("O número é menor que 70");
        }else if(n > 70 && numeroCorreto > 70){
            System.out.println("O número é maior que 70");
        }else if(n < 80 && numeroCorreto < 80){
            System.out.println("O número é menor que 80");
        }else if(n > 80 && numeroCorreto > 80){
            System.out.println("O número é maior que 80");
        }else if(n < 90 && numeroCorreto < 90){
            System.out.println("O número é menor que 90");
        }else if(n > 90 && numeroCorreto > 90){
            System.out.println("O número é maior que 90");
        }else if(n < 100 && numeroCorreto < 100){
            System.out.println("O número é menor que 100");
        }else if(n > 100 && numeroCorreto > 100){
            System.out.println("O número é maior que 100");
        }else{
            System.out.println("Número inválido");
        }
        
    }}
    */
        // -- Classificação de idade --
        /*
        System.out.println("Insira sua idade");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if(idade < 12){
            System.out.println("Você é criança");
        }else if(idade >= 12 && idade < 18){
            System.out.println("Você é adolescente");
        }else if(idade >= 18 && idade < 60){
            System.out.println("Você é adulto");
        }else{
            System.out.println("Você é idoso");
        }
        */

        // -- Desconto em compra --
        /*
        System.out.println("Insira o valor de sua compra:");
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        if(valor >= 100 && valor < 250){
            System.out.println("Você ganhou desconto de 10%");
            System.out.println("O valor da sua compra é: R$" + (valor - (valor * 0.1)));
        } else if(valor >= 250 && valor < 500){
            System.out.println("Você ganhou desconto de 15%");
            System.out.println("O valor da sua compra é: R$" + (valor - (valor * 0.15)));
        } else if(valor >= 500){
            System.out.println("Você ganhou desconto de 20%");
            System.out.println("O valor da sua compra é: R$" + (valor - (valor * 0.2)));
        } else{
            System.out.println("Você não ganhou desconto");
            System.out.println("O valor da sua compra é: R$" + valor);
        }
        */

        // -- Triângulo --
        /*
        System.out.println("Insira um lado do triângulo");
        Scanner sc = new Scanner(System.in);
        int lado1 = sc.nextInt();
        System.out.println("Insira outro lado do triângulo");
        int lado2 = sc.nextInt();
        System.out.println("Insira outro lado do triângulo");
        int lado3 = sc.nextInt();
         
        
        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("O triângulo é equilátero");
        }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("O triângulo é isósceles");
        }else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("O triângulo é escaleno");
        }else{
            System.out.println("Não é um triângulo");
        }
        */




        // -- Nota --
        /*
        if(nota >= 60 && nota <= 100){
            System.out.println("Aprovado");
        }else if(nota >= 40 && nota < 60){
            System.out.println("Recuperação");
        }else if(nota < 40 && nota >= 0){
            System.out.println("Reprovado");
        } else{
            System.out.println("Nota inválida");
        }
        */


        /* -- Positivo ou negativo -- 
        if( n > 0){
            System.out.println("O número é positivo");
        }else if(n < 0){
            System.out.println("O número é negativo");
        }else{
            System.out.println("O número é zero");
        }

        if(n % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
        */

        // -- Maior ou menor de idade --
        /*
        if(idade >= 18 && idade <= 70){
            System.out.println("Você é maior de idade e é obrigado a votar");
        } else if(idade >= 70){
            System.out.println("Seu voto é facultativo");
        }else if(idade >= 16 && idade < 18){
            System.out.println("Seu voto é facultativo");
        }else{
            System.out.println("Você não pode votar");
        }
        */





    








