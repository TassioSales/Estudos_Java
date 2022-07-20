import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite aqui o seu salario: ");
        double salario = scan.nextDouble();
        if (salario <= 280){
            System.out.println("Salario: R$ " + salario);
            System.out.println("Percentual de aumento e 20%");
            System.out.println("Salario com aumento: R$ " + (salario + (salario * 20 / 100)));
        }else if (salario > 280 && salario <= 700) {
            System.out.println("Salario: R$ " + salario);
            System.out.println("Percentual de aumento e 15%");
            System.out.println("Salario com aumento: R$ " + (salario + (salario * 15 / 100)));
        }else if (salario > 700 && salario <= 1500) {
            System.out.println("Salario: R$ " + salario);
            System.out.println("Percentual de aumento e 10%");
            System.out.println("Salario com aumento: R$ " + (salario + (salario * 10 / 100)));
        }else if (salario > 1500) {
            System.out.println("Salario: R$" + salario);
            System.out.println("Percentual de aumento e 5%");
            System.out.println("Salario com aumento: R$" + (salario + (salario * 5 / 100)));
        }
    }
}
