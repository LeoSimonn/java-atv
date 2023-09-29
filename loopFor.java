/*. Questão: Tabuada de Mul0plicação
Implemente um programa que solicite ao usuário um número inteiro e, em
seguida, use um loop for para exibir a tabuada de mul:plicação desse número
de 1 a 10. 

public class loopFor{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Insira um número inteiro");
        n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
*/
import java.util.Scanner;

/*2. Questão: Sequência Fibonacci
Implemente um programa que gere os primeiros n números da sequência de
Fibonacci usando um loop for. 

public class loopFor{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, a = 0, b = 1, c;

        System.out.println("Insira um número inteiro");
        n = sc.nextInt();

        System.out.println(a); // 0
        System.out.println(b); // 1
        
        for(int i = 0; i < n; i++){
            c = a + b;
            System.out.println(c);
            a = b;  // a = 1
            b = c;  // b = 1
        }
    }
}
*/

/*3. Questão: Números Primos
Implemente um programa que encontre e exiba os primeiros 10 números primos
usando um loop for. */


public class loopFor{
    public static void main(String[] args){
    
        for(int i = 1; i <= 30; i++){

            int cont = 0;

            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cont++;
                }
            }
            if(cont == 2){
                System.out.println(i);
            }
        }

         
    }
}

/*4. Questão: Triângulo de Asteriscos
Crie um programa que use um loop for para desenhar um triângulo de asteriscos 
(*), onde a base do triângulo tenha 10 asteriscos.
Ex:
*
**
***
****
***** 

public class loopFor{

    public static void main(String[] args){

        for(int i = 0; i < 10; i++){

        String asterisco = "*";
            System.out.println(asterisco.repeat(i));
        }

    }

}*/

/*5. Questão: Impressão de Padrão Numérico
Crie um programa que recebendo um número de linhas do usuário, imprimirá
um padrão numérico como o seguinte:
1
22
333
4444
55555

public class loopFor{
    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

     int num = 1;

    System.out.println("Insira o número de linhas:");
    num = sc.nextInt();
                 
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i);
        }
        System.out.println();
    }

     }
 }
*/
    





