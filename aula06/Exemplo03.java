import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Digite um numero: ");
        //int num = scan.nextInt();
        //System.out.println("Voce digitou o numero: " + num);
        //System.out.print("Digite uma palavra: ");
        //String palavra = scan.next();
        //System.out.println("Voce digitou a palavra: " + palavra);
        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();
        System.out.println("Voce digitou a frase: " + frase);
    }
}