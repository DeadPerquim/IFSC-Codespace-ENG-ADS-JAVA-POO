import java.util.Scanner;

public class Formula_de_bhaskara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor de a: ");
        double a = entrada.nextDouble();1

        System.out.println("Insira o valor de b: ");
        double b = entrada.nextDouble();

        System.out.println("Insira o valor de c: ");
        double c = entrada.nextDouble();

        double delta = ((b*b)-4*a*c);

        double x1 = (-b+Math.sqrt(delta))/(2*a);
        double x2 = (-b-Math.sqrt(delta))/(2*a);

        System.out.println("Resultado do x1: " +x1);
        System.out.println("Resultado do x2: " +x2);

        entrada.close();
    }    
}