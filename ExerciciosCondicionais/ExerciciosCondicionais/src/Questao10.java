import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Em que turno voce estuda: ");
        String turno = scan.nextLine().toUpperCase();
        char t = turno.charAt(0);
        switch (t){
            case 'M' -> System.out.println("Voce estuda no turno matutino");
            case 'V' -> System.out.println("Voce estuda no turno vespertino");
            case 'N' -> System.out.println("Voce estuda no turno noturno");
            default -> System.out.println("Turno invalido");
        }
        if (t == 'M') {
            System.out.println("Voce estuda no turno matutino");
        } else if (t == 'V') {
            System.out.println("Voce estuda no turno vespertino");
        } else if (t == 'N') {
            System.out.println("Voce estuda no turno noturno");
        } else {
            System.out.println("Turno invalido");
        }

    }
}
