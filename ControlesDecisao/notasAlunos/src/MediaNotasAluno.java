import java.util.Scanner;

public class MediaNotasAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media <= 4){
            System.out.println("Aluno reprovado!");
            System.out.println("Sua média foi: " + media);
            System.out.println("Seu conceito é: E");
        } else if (media > 4 && media <= 6 ){
            System.out.println("Aluno em recuperação!");
            System.out.println("Sua média foi: " + media);
            System.out.println("Seu conceito é: D");
        } else if (media > 6 && media <= 7.5){
            System.out.println("Aluno aprovado");
            System.out.println("Sua média foi: " + media);
            System.out.println("Seu conceito é: C");
        } else if (media > 7.5 && media <= 9){
            System.out.println("Aluno aprovado com distinção!");
            System.out.println("Sua média foi: " + media);
            System.out.println("Seu conceito é: B");
        } else if (media > 9 && media <= 10){
            System.out.println("Aluno aprovado com louvor!");
            System.out.println("Sua média foi: " + media);
            System.out.println("Seu conceito é: A");
        } else {
            System.out.println("Aluno aprovado com louvor!");
            System.out.println("Sua média foi: " + media);
            System.out.println("Seu conceito é: A");
        }
    }
}
