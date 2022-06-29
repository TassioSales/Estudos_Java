import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que voce ganha por hora: ");
        double valorHora = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mes: ");
        double horasTabalhadas = scan.nextDouble();
        double salarioBruto = valorHora * horasTabalhadas;
        System.out.printf("Seu Salario bruto sem desconto e: R$ %.2f", salarioBruto);
        double ir =salarioBruto * 0.11;
        System.out.printf("\nSeu Salario bruto com desconto de IR e: R$ %.2f", ir);
        double inss = salarioBruto * 0.08;
        System.out.printf("\nSeu Salario bruto com desconto de INSS e: R$ %.2f", inss);
        double sindicato = salarioBruto * 0.05;
        System.out.printf("\nSeu Salario bruto com desconto de Sindicato e: R$ %.2f", sindicato);
        double salarioLiquido = salarioBruto - (ir + inss + sindicato);
        System.out.printf("\nSeu Salario liquido e: R$ %.2f", salarioLiquido);
        System.out.printf("\nO Total de descontos e: R$ %.2f", (ir + inss + sindicato));

    }
}
