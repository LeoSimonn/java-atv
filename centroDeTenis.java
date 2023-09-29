import java.util.Scanner;

public class centroDeTenis {
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Seja bem vindo ao Centro de Tenis!!");
    System.out.println("Vamos calcular o quanto você vai pagar pelo aluguel da quadra.");

    System.out.println("Digite o horário de início do aluguel: (Ex: 10.50 = 10:50)");
    double horaInicio = sc.nextDouble();

    System.out.println("Digite o horário de término do aluguel: (Ex: 10.50 = 10:50)");
    double horaTermino = sc.nextDouble();

    double hora = horaTermino - horaInicio;
    double horaInteira = Math.floor(hora);
    double horaDecimal = hora - horaInteira;
    double horaDecimalMinutos = horaDecimal * 60;

    System.out.println("Você alugou a quadra por " + horaInteira + " hora(s) e " + horaDecimalMinutos + " minuto(s).");

    System.out.println("Você alugou a quadra por " + hora + " hora(s).");

    double valor = 0;

    valor = horaInteira * 90;

    if(horaDecimalMinutos >= 1){
        valor = valor + 90;}
    
    if(horaInteira >= 3){
        valor = valor - (valor * 0.10);
    }

    System.out.println("O valor a ser pago é de R$" + valor + ",00 reais.");

    }

}
