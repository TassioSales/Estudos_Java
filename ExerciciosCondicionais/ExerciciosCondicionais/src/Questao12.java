import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHoraTrabalhada = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();
        double salario = valorHoraTrabalhada * horasTrabalhadas;
        if (salario <= 900) {
            System.out.println("Salario: " + salario);
            System.out.println("Voce e isento de imposto de renda");
            System.out.println("Voce e isento de Sindicato");
            System.out.println("Seu FGTS e de: " + (salario * 11 / 100));
        } else if (salario > 900 && salario <= 1500) {
            double descontoSindicato = salario * 3 / 100;
            double descontoImpostoRenda = salario * 5 / 100;
            double totalDesconto = descontoSindicato + descontoImpostoRenda;
            double salarioLiquido = salario - totalDesconto;
            double FGTS = salario * 11 / 100;
            System.out.println("Salario Bruto...............: " + salario);
            System.out.println("Desconto do Sindicato.......: " + descontoSindicato);
            System.out.println("Desconto do Imposto de Renda: " + descontoImpostoRenda);
            System.out.println("Total de Descontos..........: " + totalDesconto);
            System.out.println("FGTS........................: " + FGTS);
            System.out.println("Salario Liquido.............: " + salarioLiquido);
        } else if (salario > 1500 && salario <= 2500) {
            double descontoSindicato = salario * 3 / 100;
            double descontoImpostoRenda = salario * 10 / 100;
            double totalDesconto = descontoSindicato + descontoImpostoRenda;
            double salarioLiquido = salario - totalDesconto;
            double FGTS = salario * 11 / 100;
            System.out.println("Salario Bruto...............: " + salario);
            System.out.println("Desconto do Sindicato.......: " + descontoSindicato);
            System.out.println("Desconto do Imposto de Renda: " + descontoImpostoRenda);
            System.out.println("Total de Descontos..........: " + totalDesconto);
            System.out.println("FGTS........................: " + FGTS);
            System.out.println("Salario Liquido.............: " + salarioLiquido);
        } else if (salario > 2500) {
            double descontoSindicato = salario * 3 / 100;
            double descontoImpostoRenda = salario * 15 / 100;
            double totalDesconto = descontoSindicato + descontoImpostoRenda;
            double salarioLiquido = salario - totalDesconto;
            double FGTS = salario * 11 / 100;
            System.out.println("Salario Bruto...............: " + salario);
            System.out.println("Desconto do Sindicato.......: " + descontoSindicato);
            System.out.println("Desconto do Imposto de Renda: " + descontoImpostoRenda);
            System.out.println("Total de Descontos..........: " + totalDesconto);
            System.out.println("FGTS........................: " + FGTS);
            System.out.println("Salario Liquido.............: " + salarioLiquido);
        }else {
            System.out.println("Salario invalido");
        }

    }
}
