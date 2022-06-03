import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que voce ganha por hora: ");
        double valorHora = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mes: ");
        double horasTabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTabalhadas;

        System.out.printf("O valor a receber no fim do mes sera R$ %.2f", salarioBruto);
    }
}
