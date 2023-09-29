/*import java.util.Scanner;
import java.util.Random;

public class cond {

    public static void main(String[] args){







    }
}

    // Acertar 2x um número aleatorio
    /*
    Random gerador = new Random();
    int num1 = gerador.nextInt(10);

    System.out.println(num1);
    
    System.out.println("Acabou de ser gerado um número aleatório entre 0 e 10");
    System.out.println("Tente adivinhar o número gerado");

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    if(x == num1){
        System.out.println("Parabéns, você acertou o número gerado");
        int num2 = gerador.nextInt(10);
        System.out.println(num2);
        int y = sc.nextInt();
        if(y == num2){
            System.out.println("Parabéns, você acertou o número gerado novamente.");
        }
    }else{
        System.out.println("Você errou o número gerado");


    }
 }
}
*/
/*Crie um sistema para classificar um pato. Pergunte ao usuário se o animal faz “Quack”,
se ele fizer, pergunte se ele também anda como um pato, se ele andar como um,
pergunte se o animal nada como um pato. Caso o animal possua todas essas
caracterísMcas, ele é um pato. Caso o animal não possua alguma, mostre ao usuário qual
das caracterísMcas ele não obedece.

// ARRUMAR O CÓDIGO

int andaA = 1;
int nadaA = 1;
int quackA = 1;

System.out.println("Você acabou de ganhar um pato!!!");
System.out.println("O animal faz quack?");

Scanner sc = new Scanner(System.in);
String quack = sc.next();

if(quack.equals("sim") || quack.equals("Sim")){
    quackA = 1;
    System.out.println("O animal anda como um pato?");
    String anda = sc.next();
    if(anda.equals("sim") || anda.equals("Sim")){
        andaA = 1;
        System.out.println("O animal nada como um pato?");
        String nada = sc.next();
        if(nada.equals("sim") || nada.equals("Sim")){
            nadaA = 1;
            System.out.println("O animal é um pato");} 
        }else{andaA = 0;
            }
    }else{
        quackA = 0;
        System.out.println("O animal não é um pato");
        if(quackA == 0){
            System.out.println("O animal não faz quack");}
        if(andaA == 0){
            System.out.println("O animal não anda como um pato");} 
        if(nadaA == 0){
            System.out.println("O animal não nada como um pato");}
        }  
}
}*/
        // Frete
        /*
         * Peça ao usuário para inserir o valor total da compra e o estado de desMno. Verifique e
calcule o valor do frete de acordo com o estado: 10% para "região sul", 15% para "região
sudeste", 20% para outras. Caso o frete seja de 20%, pergunte ao usuário se ele aceita
um desconto promocional de 5%.
         */
/*
        System.out.println("Insira o valor total da compra");
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        System.out.println("Insira o estado de destino");
        String estado = sc.next();

        if(estado.equals("sul") || estado.equals("Sul")){
            System.out.println("O valor do frete é de 10%");
            System.out.println("O valor total da compra é de: " + (valor + (valor * 0.1)));

        }else if(estado.equals("sudeste") || estado.equals("Sudeste")){
            System.out.println("O valor do frete é de 15%");
            System.out.println("O valor total da compra é de: " + (valor + (valor * 0.15)));
        }else {
            System.out.println("O valor do frete é de 20%");
            System.out.println("O valor total da compra é de: " + (valor + (valor * 0.20)));
            System.out.println("Você aceita um desconto promocional de 5%?");
            String aceita = sc.next();
            if(aceita.equals("sim") || estado.equals("Sim")){
                System.out.println("O valor final de sua compra: " + (valor + (valor * 0.15)));
            }else{
            System.out.println("O valor total da compra é de: " + (valor + (valor * 0.20)));
            }
        }
}
}
*/
        // -- Montanha russa --
        /* 
        System.out.println("Insira sua altura em metros");
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();

        System.out.println("Insira sua idade");
        int idade = sc.nextInt();

        if(altura >= 1.20 && idade >= 12){
            System.out.println("Apto");
        }else if(altura < 1.20){
            System.out.println("Altura insuficiente");
        }else if(idade < 12){
            System.out.println("Idade insuficiente");
        }
    }
}
*/
        // -- Estações do ano --
        /*
        System.out.println("Insira o seu hemisfério: (Norte ou Sul)");
        Scanner sc = new Scanner(System.in);
        String hemisferio = sc.next();

        System.out.println("Insira um mês de 1 a 12");
        int mes = sc.nextInt();

        if(hemisferio.equals("Sul") || hemisferio.equals("sul")){
            if(mes == 3 || mes == 4 || mes == 5){
                    System.out.println("Outono");
                }else if(mes == 6 || mes == 7 || mes == 8){
                    System.out.println("Inverno");
                }else if(mes == 9 || mes == 10 || mes == 11){
                    System.out.println("Primavera");
                }else if(mes == 12 || mes == 1 || mes == 2){
                    System.out.println("Verão");
            }
        } else {
            if(mes == 3 || mes == 4 || mes == 5){
                    System.out.println("Primavera");
                }else if(mes == 6 || mes == 7 || mes == 8){
                    System.out.println("Verão");
                }else if(mes == 9 || mes == 10 || mes == 11){
                    System.out.println("Outono");
                }else if(mes == 12 || mes == 1 || mes == 2){
                    System.out.println("Inverno");
            }
        }
    }
}
        */
        /*
        // -- Notas Aninhadas --
        System.out.println("Insira uma nota de 0 a 100");

        int nota = 0;

        Scanner sc = new Scanner(System.in);
        nota = sc.nextInt();

        if(nota <= 100 && nota >= 0){
                System.out.println("Nota válida");
            if(nota <= 100 && nota >= 90){
                System.out.println("A");
                if(nota <= 100 && nota >= 95)
                 System.out.println("A+");
                if(nota < 95 && nota >= 90)
                 System.out.println("A-");
            }
        if(nota <= 89 && nota >= 80){
                System.out.println("B");
        }else if(nota <= 79 && nota >= 70){
                System.out.println("C");
        }else if(nota <= 69 && nota >= 0){
                System.out.println("D");
        }
        }else{
        System.out.println("Nota inválida");}

    }*/


