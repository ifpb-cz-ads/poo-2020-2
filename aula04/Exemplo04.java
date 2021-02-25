public class Exemplo04 {
    public static void main(String[] args) {
        int media = 8;

        switch(media) {
            case 10:
                System.out.println("Seu conceito e A");
                break;
            case 9:
                System.out.println("Seu conceito e B");
                break;
            case 8:
            case 7:
                System.out.println("Seu conceito e C");
                break;
            default:
                System.out.println("Seu conceito e E");
        }
    }
}