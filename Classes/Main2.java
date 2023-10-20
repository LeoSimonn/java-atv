package Classes;

public class Main2{

    public static void main(String[] args){

        Pessoa pericles = new Pessoa("Pericles", 54, 1.90, 
        "EXALTA", true);
        Pessoa thiaguinho = new Pessoa("Thiaguinho", 40, 1.72, "SAMBA", false);

        System.out.println(thiaguinho.getNome());
        System.out.println(pericles.getNome());

        System.out.println(pericles.aniversario());

        System.out.println(pericles.getIdade());

    }



}