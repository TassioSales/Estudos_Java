import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        if (media < 7) {
            System.out.println("Reprovado");
            System.out.println("Media: " + media);
            System.out.println("Conceito: E");
            System.out.println("Comentário: Estude mais");
        }else if (media >= 10){
            System.out.println("Aprovado com Distinção");
            System.out.println("Media: " + media);
            System.out.println("Conceito: A");
            System.out.println("Comentário: Parabéns suas notas foram excelentes");

        }else {
            System.out.println("Aprovado");
            System.out.println("Media: " + media);
            System.out.println("Conceito: B");
            System.out.println("Comentário: Parabéns suas notas foram boas");
        }

    }
}
