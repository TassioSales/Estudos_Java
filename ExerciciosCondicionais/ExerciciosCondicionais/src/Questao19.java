import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args){
        /*centenas, dezenas, unidades*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero (menor que 1000): ");
        int numero = scan.nextInt();
        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;
        System.out.println("Centenas: " + centenas);
        System.out.println("Dezenas: " + dezenas);
        System.out.println("Unidades: " + unidades);

    }
}
