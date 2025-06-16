import java.util.Scanner;

public class Algorítmo_área_Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite Base:");
        double B = entrada.nextDouble();
    
        System.out.print("Digite Altura:");
        double H = entrada.nextDouble();

        double area = (B*H) / 2;
    
        System.out.println("sua área é:" + area);
    
        entrada.close();
    }
}
