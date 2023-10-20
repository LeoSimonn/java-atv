package AnalisaStrings;

public class AnalisaString {

    public boolean comecaCom(String palavra, String prefixo){
        return palavra.startsWith(prefixo);
    }

    public boolean palindromo(String str1, String str2){
        boolean ePalindromo = true;

        // se o tamanho da string 1 for diferente do tamanho da string 2, então não é palíndromo
        if(str1.length() != str2.length()){
            return ePalindromo = false;
        }

        // percorre a string 1 e compara com a string 2
        // se o caractere da string 1 for diferente do caractere da string 2, então não é palíndromo
        // se o caractere da string 1 for igual ao caractere da string 2, então é palíndromo
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(str2.length() - 1 - i)){
                return ePalindromo = false;
            }
        }
        return ePalindromo = true;
    }

    public boolean strTerminaComSegunda(String str1, String str2){
        boolean terminamIguais = false;
        if(str1.charAt(str1.length()-1) == str2.charAt(str2.length()-1)){
            terminamIguais = true;
        }
        return terminamIguais;
    }

    public boolean iguaisOuNao(String str1, String str2){

        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equals(str2);
    }


}
