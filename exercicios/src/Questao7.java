import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        double lado1 = scan.nextDouble();
        System.out.println("Digite o segundo lado: ");
        double lado2 = scan.nextDouble();

        double area = lado1 * lado2;

        System.out.printf("A area do quadrado e %.2f \n", area);
        System.out.printf("O dobro dessa area e %.2f", area * 2);

    }
}
