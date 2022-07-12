public class calculaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lado A: ");
        double ladoA = sc.nextDouble();
        System.out.println("Digite o valor do lado B: ");
        double ladoB = sc.nextDouble();
        System.out.println("Digite o valor do lado C: ");
        double ladoC = sc.nextDouble();
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("O triangulo é um triangulo equilatero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("O triangulo é um triangulo isosceles");
            } else {
                System.out.println("O triangulo é um triangulo escaleno");
            }
        } else {
            System.out.println("Não é um triangulo");
        }
    }
}
