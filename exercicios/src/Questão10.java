import java.util.Scanner;

public class Questão10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tempera em graus Celsius: ");
        double Celsius = scan.nextDouble();
        double Ferenheit = (Celsius * 9 / 5) + 32;
        System.out.printf("A temperatura em graus Ferenheit eh: %.0f F°", Ferenheit);
    }
}
