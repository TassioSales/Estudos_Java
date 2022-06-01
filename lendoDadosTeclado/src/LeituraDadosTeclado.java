import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeComplete = scan.nextLine();

        System.out.println("Seu nome completo e: " + nomeComplete);

        System.out.println("Digite seu Primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu Primeiro nome : " + primeiroNome);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade e: " + idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura e: " + altura);

        System.out.println("Digite o seu primeiro nome, sobrenome, quantidade de filhos, altura e peso");
        String primeiroNomeDois = scan.next();
        String sobrenome = scan.next();
        int idadeDois = scan.nextInt();
        double alturaDois = scan.nextDouble();
        double peso = scan.nextDouble();

        System.out.println("Seu primeiro nome e: " + primeiroNomeDois + "Seu sobrenome e: " + sobrenome);
        System.out.println("Sua idade e : " + idadeDois + "Altura: " + alturaDois+ "Peso: " + peso);



    }
}
