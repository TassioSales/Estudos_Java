import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();
        System.out.println("Digite o Terceiro numero: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior numero é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior numero é: " + num2);
        } else {
            System.out.println("O maior numero é: " + num3);
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("O menor numero é: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O menor numero é: " + num2);
        } else {
            System.out.println("O menor numero é: " + num3);
        }
    }
}
