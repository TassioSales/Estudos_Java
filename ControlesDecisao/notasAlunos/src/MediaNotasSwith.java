import java.util.Scanner;

public class MediaNotasSwith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;

        switch ((int) media) {
            case 1, 2, 3, 4 -> {
                System.out.println("Aluno reprovado!");
                System.out.println("Sua média foi: " + media);
                System.out.println("Seu conceito é: E");
            }
            case 5, 6 -> {
                System.out.println("Aluno em recuperação!");
                System.out.println("Sua média foi: " + media);
                System.out.println("Seu conceito é: D");
            }
            case 7, 8, 9 -> {
                System.out.println("Aluno aprovado");
                System.out.println("Sua média foi: " + media);
                System.out.println("Seu conceito é: C");
            }
            case 10 -> {
                System.out.println("Aluno aprovado com distinção!");
                System.out.println("Sua média foi: " + media);
                System.out.println("Seu conceito é: B");
            }
            default -> {
                System.out.println("Aluno aprovado com louvor!");
                System.out.println("Sua média foi: " + media);
                System.out.println("Seu conceito é: A");
            }
        }
    }
}
