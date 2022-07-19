import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o um numero: ");
        double numero = scan.nextDouble();
        if (numero < 0) {
            System.out.println("O numero e negativo");
        } else if (numero > 0) {
            System.out.println("O numero e positivo");
        } else {
            System.out.println("O numero e neutro");
        }
    }
}
