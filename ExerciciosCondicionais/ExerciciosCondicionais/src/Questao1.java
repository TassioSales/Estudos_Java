import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o um numero: ");
        double numero = scan.nextDouble();
        System.out.println("Digite o outro numero: ");
        double numero2 = scan.nextDouble();
        if (numero > numero2) {
            System.out.println("O"+ numero + " e maior " + numero2);
        } else if (numero < numero2) {
            System.out.println("O "+ numero2 + " e maior "+ numero);
        } else {
            System.out.println("Os numeros são iguais");
        }
    }
}
