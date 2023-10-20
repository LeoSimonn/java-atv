
public class MetodosString {
    public static void main(String[] args) {
        String palavra = "banana";

        //Tamanho da String
        System.out.println(palavra.length());

        //Concatenação
        String maca = "maçã";
        String palavra2 = palavra + maca;
        System.out.println(palavra2);

        //Substituição
        String palavra3 = palavra2.replace("banana", "abacaxi");
        System.out.println(palavra3);

        //Substituição de caracteres
        String palavra4 = palavra.replace('a', 'e');
        System.out.println(palavra4);

        // Selecao de caracter
        char letra = palavra.charAt(0);
        System.out.println(letra);

        // Comparação de Strings
        String palavra5 = "banana";
        String palavra6 = "banana";
        String palavra7 = "abacaxi";
        
        System.out.println(palavra5.equals(palavra6));
        System.out.println(palavra5.equals(palavra7));

        // Comparação ignorando maiúsculas e minúsculas
        System.out.println(palavra5.equalsIgnoreCase(palavra6));
        System.out.println(palavra5.equalsIgnoreCase(palavra7));
        

        // Passar a string para caracteres minúsculos
        String palavra8 = "BANANA";
        System.out.println(palavra8.toLowerCase());

        // Passar a string para caracteres maiúsculos
        String palavra9 = "banana";
        System.out.println(palavra9.toUpperCase());


    }
}
