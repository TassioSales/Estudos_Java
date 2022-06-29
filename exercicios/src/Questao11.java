import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = scan.nextDouble();
        System.out.println("O produto do dobro do primeiro com a metade do segundo e: " + (num1 * 2 * num2 / 2));
        System.out.println("A soma do triplo do primeiro com o terceiro e: " + (num1 * 3 + num2 * 3));
        System.out.println("O terceiro elevado ao cubo e: " + (num2 * num2 * num2));
    }
}
