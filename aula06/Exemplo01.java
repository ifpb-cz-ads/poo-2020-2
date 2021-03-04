public class Exemplo01 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] nums = new int[10];
        nums[0] = 25;
        System.out.println(nums[0]);
        System.out.println(numeros[1]);
        System.out.println("O tamanho do veto e: " + nums.length);

        //int i = 0;
        //while (i < numeros.length) {
        //    System.out.println(numeros[i]);
        //    i++;
        //}

        for (int elemento : numeros) {
            System.out.println(elemento);
        } 

        String[] palavras = {"programacao",  "orientada", "objetos"};
        String[][] frases = new String[10][10];
    }
}