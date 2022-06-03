import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        Scanner scan = new Scanner(System.in);
        System.out.println("Didite a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = scan.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = scan.nextDouble();

        double notaMedia = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A nota media desse aluno e: " + notaMedia);

    }
}
