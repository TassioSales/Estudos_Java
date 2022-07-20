import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro produto: ");
        double produto1 = scan.nextDouble();
        System.out.println("Digite o valor do segundo produto: ");
        double produto2 = scan.nextDouble();
        System.out.println("Digite o valor do terceiro produto: ");
        double produto3 = scan.nextDouble();

        if(produto1 < produto2 && produto1 < produto3) {
            System.out.println("O produto com menor valor e R$: " + produto1);
        } else if(produto2 < produto1 && produto2 < produto3) {
            System.out.println("O produto com menor valor e R$: " + produto2);
        } else {
            System.out.println("O produto com menor valor e R$: " + produto3);
        }

    }
}
