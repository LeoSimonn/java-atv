package Calculadora;
    
    public class Calculadora{

    int num;
    int resultado;

    public int soma(int num){
        resultado += num;
        return resultado;
        
    }}
    /* 
    public double subtracao(){
        return this.num1 - this.num2;
    }

    public double multiplicacao(){
        return this.num1 * this.num2;
    }  

    public double divisao(){
        return this.num1 / this.num2;
    }

    public double potencia(){
        double resultado = 1;
        for(int i = 0; i < this.num2; i++){
            resultado = resultado * this.num1;
        }
        return resultado;
    }

    public double raiz(){
        return Math.sqrt(this.num1);
    }

    public double fatorial(){
        double resultado = 1;
        for(int i = 1; i <= this.num1; i++){
            resultado = resultado * i;
        }
        return resultado;
    }

    

}
/* 
2^2 = 2 * 2
2^3 = 2 * 2 * 2
2^4 = 2 * 2 * 2 * 2
2^5 = 2 * 2 * 2 * 2 * 2 
*/