import java.util.Scanner;

public class Questao16 {
    /* algarito de Raizes equação de segundo grau */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        int a = scan.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = scan.nextInt();
        System.out.println("Digite o valor de c: ");
        int c = scan.nextInt();
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Não existe raizes reais");
        }else if (delta == 0) {
            System.out.println("Existe uma raiz real");
            System.out.println("Raiz: " + (-b / (2 * a)));
        }else {
            System.out.println("Existe duas raizes reais");
            System.out.println("Raiz 1: " + ((-b + Math.sqrt(delta)) / (2 * a)));
            System.out.println("Raiz 2: " + ((-b - Math.sqrt(delta)) / (2 * a)));
        }
    }
}
