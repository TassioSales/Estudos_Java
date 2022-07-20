import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;

        if(media >= 7) {
            System.out.println("Aprovado!");
        } else if(media >= 5 && media < 7) {
            System.out.println("Recuperacao!");
        } else {
            System.out.println("Reprovado!");
        }

        switch ((int) media) {
            case 10 -> System.out.println("Aprovado com Distincao!");
            case 9, 8, 7 -> System.out.println("Aprovado!");
            case 6 -> System.out.println("Recuperação!");
            default -> System.out.println("Reprovado!");
        }

    }
}
