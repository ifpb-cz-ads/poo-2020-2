public class Exemplo04 {
    public static void main(String[] args) {
        int busca = 100;
        for (int i = 0; i < 100; i++) {
            if (i == busca) {
                System.out.println("Numero encontrado, na posicao: " + i);
                break;
            }
        }
        System.out.println("O numero nao foi encontrado.");
    }
}