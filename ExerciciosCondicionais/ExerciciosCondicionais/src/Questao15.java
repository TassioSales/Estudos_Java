import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do primeiro lado do triangulo: ");
        int lado1 = scan.nextInt();
        System.out.println("Digite o tamanho do segundo lado do triangulo: ");
        int lado2 = scan.nextInt();
        System.out.println("Digite o tamanho do terceiro lado do triangulo: ");
        int lado3 = scan.nextInt();
        if (lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado1 + lado2) {
            System.out.println("Nao forma um triangulo");
        }else {
            System.out.println("Forma um triangulo");

        }
    }
}
