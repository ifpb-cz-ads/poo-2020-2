import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("programacao");
        palavras.add("orientada");
        palavras.add("objetos");

        System.out.println("O tamanho do lista e: " + palavras.size());

        for (String elemento : palavras) {
            System.out.println(elemento);
        } 

        System.out.println("Elemento indice 0: " + palavras.get(0));
        System.out.println("Indice do elemento: " + palavras.indexOf("objetos"));

        palavras.remove(0);
        
        System.out.println("Elemento indice 0: " + palavras.get(0));
    }
}