import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o um letra: ");
        String letra = scan.next().toUpperCase();
        char c = letra.charAt(0);
        if (c == 'M'){
            System.out.println("Masculino");
        }else if (c == 'F'){
            System.out.println("Feminino");
        }else {
        System.out.println("Nao reconhecido");
        }
        switch (c) {
            case 'M' -> System.out.println("Masculino");
            case 'F' -> System.out.println("Feminino");
            default -> System.out.println("Nao reconhecido");
        }
    }
}
