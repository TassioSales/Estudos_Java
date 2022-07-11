import java.util.Scanner;

public class if_else_dois {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product value: (Entre com o valor do produto)");
        double value = input.nextDouble();
        if(value <= 10){
            System.out.println("The product is cheap (O produto e barato)");
        }
        else if(value > 10 && value <= 15){
            System.out.println("The product is normal (O produto e normal)");
        }
        else if(value >= 15 && value <= 20){
            System.out.println("The product is expensive (O produto e caro)");
        }
        else{
            System.out.println("The product is very expensive (O produto e muito caro)");
        }
    }
}
