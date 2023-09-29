import java.util.Scanner;

public class pacienteSouD {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Bem vindo ao sistema de cadastro de pacientes.!!");

    System.out.println("Diga a temperatura do paciente: (Ex: 36.5 = 36,5))");
    double temperatura = sc.nextDouble();
    
    if(temperatura > 35.0){
        System.out.println("O paciente está tossindo?");
        String tosse = sc.next();
                    if(tosse.equals("sim")){
                        System.out.println("O paciente está doente.");
                    } else {
                        System.out.println("O paciente não está doente.");
                    }
    } else {
        System.out.println("O paciente está com febre?");
        String febre = sc.next();
                    if(febre.equals("sim")){
                        System.out.println("O paciente está doente.");
                    } else {
                        System.out.println("Qual o tipo sanguíneo do paciente? (A, B, AB ou O))");
                        String sangue = sc.next();


                        if(sangue.equals("A")){
                            System.out.println("O paciente está saúdavel.");
                        } else if(sangue.equals("B")){ 
                            System.out.println("O paciente está saúdavel.");
                        } else if(sangue.equals("AB")){ 
                            System.out.println("O paciente está saúdavel.");
                        } else if (sangue.equals("O")){ 
                            System.out.println("O paciente está doente.");
                        }

                    }
    }
    }



    
}
