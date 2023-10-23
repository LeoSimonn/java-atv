package RetanguloTriângulo;

public class SomaObjetos {
    
    public double doisTriangArea(Triangulo primeiroTriang, Triangulo segundoTriang){
        double doisTriangArea = primeiroTriang.areaTriang() + segundoTriang.areaTriang();
        return doisTriangArea;
   
}

    public double doisRetangArea(Retangulo primeiroRetang, Retangulo segundoRetang){
        double doisRetangArea = primeiroRetang.areaRetang() + segundoRetang.areaRetang();
        return doisRetangArea;
    }

    public double doisRetangPerimetro(Retangulo primeiroRetang, Retangulo segundoRetang){
        double doisRetangPerimetro = primeiroRetang.perimetroRetang() + segundoRetang.perimetroRetang();
        return doisRetangPerimetro;
    }

    public double doisTriangPerimetro(Triangulo primeiroTriang, Triangulo segundoTriang){
        double doisTriangPerimetro = primeiroTriang.perimetroTriang() + segundoTriang.perimetroTriang();
        return doisTriangPerimetro;
    }

    public double TriangRetangArea(Triangulo primeiroTriang, Retangulo primeiroRetang){
        double TriangRetangArea = primeiroTriang.areaTriang() + primeiroRetang.areaRetang();
        return TriangRetangArea;
    }

    public double TriangRetangPerimetro(Triangulo primeiroTriang, Retangulo primeiroRetang){
        double TriangRetangPerimetro = primeiroTriang.perimetroTriang() + primeiroRetang.perimetroRetang();
        return TriangRetangPerimetro;
    }

}
