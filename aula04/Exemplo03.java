public class Exemplo03 {
    public static void main(String[] args) {
        double media = 4.0;

        if (media >= 7.0) {
            System.out.println("Parabens, voce passou na disciplina!");
        } else if ((media < 7) && (media >= 5)) {
            System.out.println("Voce esta na final.");
        } else {
            System.out.println("Voce foi reprovado.");
        }
    }
}