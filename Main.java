import java.util.Arrays;

import Vetores.OperadorDeVetores;

public class Main {
    
    public static void main(String[] args){

    int[] vetor = {1, 2, 3, 4, 5};
    int[] vetor3 = {1, 2, 3, 4, 5};
    double[] vetor2 = {1.3, 2.7, 3.2, 4.8, 5.9};

    OperadorDeVetores operador = new OperadorDeVetores();

    System.out.println(operador.somarVetorFuncao(vetor));
    System.out.println(operador.multiplicarVetor(vetor2));
    System.out.println(Arrays.toString(operador.somarDoisVetor(vetor,vetor3)));
    System.out.println(Arrays.toString(operador.concatenarDoisVetor(vetor,vetor3)));


    }

}
