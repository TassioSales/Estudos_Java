import java.util.Scanner;


public class Questao9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temoeratura em graus Ferenheit: ");
        double Ferenheit = scan.nextDouble();
        double Celsius = (Ferenheit - 32) * 5 / 9;
        System.out.printf("A temperatura em graus Celsius eh: %.0f C°", Celsius);
    }
}
