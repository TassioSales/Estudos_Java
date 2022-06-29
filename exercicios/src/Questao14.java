import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual tamanho do arquivo em MB: ");
        double tamanho = scan.nextDouble();
        System.out.println("Qual a velocidade da internet em Mbps: ");
        double velocidade = scan.nextDouble();
        System.out.printf("O tempo de download em minutos e: %.0f minutos", tamanho / velocidade);
    }
}
