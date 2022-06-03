import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva o valro do raio: ");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("O valor da area e %.2f", area);
    }

}
