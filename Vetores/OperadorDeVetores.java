package Vetores;
import java.util.Arrays;

public class OperadorDeVetores{

    // Metodos
    // Metodo para somar os elementos de um vetor

    public int somarVetor(int[] vetor){
        int soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }
    
    public int somarVetorFuncao(int[] vetor){
        return Arrays.stream(vetor).sum();
    }
        
public double multiplicarVetor(double[] vetor2){
        double multiplicado = 1;
        for(int i = 0; i < vetor2.length; i++){
            multiplicado *= vetor2[i];
        }
        return multiplicado;
    }   

public  int[] somarDoisVetor(int[] vetor, int[] vetor3){
        int[] somaDois = new int[vetor.length];

        for(int i = 0; i < vetor.length; i++){
            somaDois[i] = vetor[i] + vetor3[i];
            
        } 
        return somaDois;
    }

public  int[] concatenarDoisVetor(int[] vetor, int[] vetor3){
        int[] concatenacaoDois = new int[vetor.length + vetor3.length];

        for(int i = 0; i < vetor.length; i++){
            concatenacaoDois[i] = vetor[i];
        } 
        for(int i = 0; i < vetor3.length; i++){
            concatenacaoDois[i + vetor.length] = vetor3[i];
        }
        return concatenacaoDois;
    }
}
