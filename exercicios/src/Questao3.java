import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){

        double num1;
        double num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Didite um numero: ");
        num1 = scan.nextDouble();
        System.out.println("Digite outro numero: ");
        num2 = scan.nextDouble();
        double num3 = num1 + num2;
        System.out.println("A some dos numero "+ num1 + " + " + num2 +" = " + num3);

    }
}
