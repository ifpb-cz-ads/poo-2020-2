public class Exemplo05 {
    public static void main(String[] args) {
        int num = 11;
        String msg = "O numero %d e %s que dez.";
        String resultado = num > 10 ? "maior" : "menor";

        System.out.println(String.format(msg, num, resultado));
    }
}