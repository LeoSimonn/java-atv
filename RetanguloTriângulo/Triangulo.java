package RetanguloTriângulo;

public class Triangulo {
    
    private double a;
    private double b;
    private double c;
    private double altura;

    public Triangulo(double a, double b, double c, double altura){
        this.a = a;
        this.b = b;
        this.c = c;
        this.altura = altura;

    }

    //Metodos

    public double getA() {
        return this.a;
    }
    
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }
    
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }
    
    public void setC(double c) {
        this.c = c;
    }

     public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double areaTriang(){
        return (this.b * this.altura) / 2;
    }

    public double perimetroTriang(){
        return this.a + this.b + this.c;
        }


}
