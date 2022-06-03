import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double metro;

        System.out.println("Digite o tamanho que metros para converte para centimetros: ");
        metro = scan.nextDouble();

        double centimetro = metro * 100;

        System.out.println("O tamanho em metros " + metro + " Convertido para centimetros e: " + centimetro+"cm");
    }
}
