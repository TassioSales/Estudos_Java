import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        /* dd/mm/aaaa e valido */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a data: ");
        String data = scan.nextLine();
        if (data.length() == 10) {
            if (data.charAt(2) == '/' && data.charAt(5) == '/') {
                System.out.println("Data valida");
            } else {
                System.out.println("Data invalida");
            }
        }
    }
}
