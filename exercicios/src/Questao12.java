import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = scan.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("O seu IMC e: %.2f \n", imc);
        System.out.printf("O seu peso ideal e %.2f: ", (72.7 * altura - 58));
    }
}
