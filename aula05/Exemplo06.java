public class Exemplo06 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";

        //String s3 = String.format(s1, s2);
        //System.out.println(s3);
        System.out.println(s1 + " " + s2); // concatenacao
        boolean igual = s1.equalsIgnoreCase(s2);
        System.out.println(igual);
        int i = s1.indexOf("c");
        System.out.println(i);
        boolean existe = s1.indexOf("d") != -1;
        System.out.println(existe);
        String s102 = s1.substring(1);
        System.out.println(s102);
    }
}