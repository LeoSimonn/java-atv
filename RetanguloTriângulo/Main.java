package RetanguloTriângulo;

public class Main {
    
    public static void main(String[] args){

        Retangulo primeiroRetang = new Retangulo(5 , 14);
        Retangulo segundoRetang = new Retangulo(2 , 6);

        Triangulo primeiroTriang = new Triangulo(4, 4, 4, 6);
        Triangulo segundoTriang = new Triangulo(4, 4, 4, 6);

        SomaObjetos soma = new SomaObjetos();

        soma.doisRetangArea(primeiroRetang, segundoRetang);
        soma.doisTriangArea(primeiroTriang, segundoTriang);
        soma.doisRetangPerimetro(primeiroRetang, segundoRetang);
        soma.doisTriangPerimetro(primeiroTriang, segundoTriang);

        soma.TriangRetangArea(primeiroTriang, primeiroRetang);
        soma.TriangRetangPerimetro(primeiroTriang, primeiroRetang);

        System.out.println("A soma das áreas dos dois retângulos é: " + soma.doisRetangArea(primeiroRetang, segundoRetang));
        System.out.println("A soma das áreas dos dois triângulos é: " + soma.doisTriangArea(primeiroTriang, segundoTriang));
        System.out.println("A soma dos perímetros dos dois retângulos é: " + soma.doisRetangPerimetro(primeiroRetang, segundoRetang));
        System.out.println("A soma dos perímetros dos dois triângulos é: " + soma.doisTriangPerimetro(primeiroTriang, segundoTriang));
        System.out.println("A soma das áreas do triângulo e do retângulo é: " + soma.TriangRetangArea(primeiroTriang, primeiroRetang));
        System.out.println("A soma dos perímetros do triângulo e do retângulo é: " + soma.TriangRetangPerimetro(primeiroTriang, primeiroRetang));
        

    }

}
