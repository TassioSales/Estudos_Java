import java.util.Scanner;

public class if_e_else {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter your age (Entre com sua idade): ");
        int age = input.nextInt();
        if(age < 18){
            System.out.println("You are of legal age (Voce e maior de idade)");
        }
        else{
            System.out.println("You are not of age (Voce nao e maior de idade)");   // else is optional
        }

    }
}
