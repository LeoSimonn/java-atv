package RetanguloTriângulo;

public class Retangulo{

    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;

    }


    //Metodos

    public double getBase() {
        return this.base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double areaRetang() {
        return this.base * this.altura;
    }

    public double perimetroRetang() {
        return 2 * (this.base + this.altura);
    }

}