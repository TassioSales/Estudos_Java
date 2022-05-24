import java.io.IOException;
import java.util.Scanner;

class Argumentos{
    public static void main(String[] args) throws IOException {
        Scanner leitura  = new Scanner(System.in);
        String resultado;
        System.out.println("Voce digitou: ");
        resultado = leitura.nextLine();
        System.out.println(resultado);
    }
}
