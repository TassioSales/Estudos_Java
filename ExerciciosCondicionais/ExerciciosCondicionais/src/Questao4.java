import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o um letra: ");
        String letra = scan.next().toUpperCase();
        char c = letra.charAt(0);
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vogal");
            default -> System.out.println("Consoante");
        }
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }

    }
}
