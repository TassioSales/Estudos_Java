import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite aqui a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite aqui a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media <= 4) {
            System.out.println("Reprovado");
            System.out.println("Media: " + media);
            System.out.println("Conceito: E");
            System.out.println("Comentário: Estude mais");
        }else if (media > 4 && media <= 6) {
            System.out.println("Recuperação");
            System.out.println("Media: " + media);
            System.out.println("Conceito: D");
            System.out.println("Comentário: Estude mais");
        }else if (media > 6 && media <= 7.5) {
            System.out.println("Aprovado");
            System.out.println("Media: " + media);
            System.out.println("Conceito: C");
            System.out.println("Comentário: Estude mais um pouco");
        }else if (media > 7.5 && media <= 9) {
            System.out.println("Aprovado");
            System.out.println("Media: " + media);
            System.out.println("Conceito: B");
            System.out.println("Comentário: Parabéns suas notas foram boas");
        }else if (media > 9) {
            System.out.println("Aprovado");
            System.out.println("Media: " + media);
            System.out.println("Conceito: A");
            System.out.println("Comentário: Parabéns suas notas foram excelentes");
        } else {
            System.out.println("Nota inválida");
        }

    }
}
