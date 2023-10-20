package Banco;

public class ContaBancaria {
    
// Atributos

 double saldo;
 double rendimentoMensalPercentual;

// Construtor

public ContaBancaria(double saldoInicial, double rendimentoMensalPercentual) {
    this.saldo = saldoInicial;
    this.rendimentoMensalPercentual = rendimentoMensalPercentual;
}

// Metodos

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void calcularRendimentoMensal () {
        this.saldo += this.saldo * (this.rendimentoMensalPercentual / 100);
    }

    public void previsaoRendimentoMensalComAporte (double aporteMensal, int meses){
        this.saldo += this.saldo * (this.rendimentoMensalPercentual / 100) * meses;
        this.saldo += aporteMensal * meses;
        
    }

    public void previsaoRendimentoMensal (int meses){
        this.saldo += this.saldo * (this.rendimentoMensalPercentual / 100) * meses;
    }




    

    


}
