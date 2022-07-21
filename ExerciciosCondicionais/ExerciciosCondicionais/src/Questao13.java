import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite aqui o numero do dia da semana: ");
        int dia = scan.nextInt();
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Dia inválido");
        }
        if (dia == 1) {
            System.out.println("Domingo");
        }else if (dia == 2) {
            System.out.println("Segunda-feira");
        }else if (dia == 3) {
            System.out.println("Terça-feira");
        }else if (dia == 4) {
            System.out.println("Quarta-feira");
        }else if (dia == 5) {
            System.out.println("Quinta-feira");
        }else if (dia == 6) {
            System.out.println("Sexta-feira");
        }else if (dia == 7) {
            System.out.println("Sábado");
        }else {
            System.out.println("Dia inválido");
        }
    }
}
