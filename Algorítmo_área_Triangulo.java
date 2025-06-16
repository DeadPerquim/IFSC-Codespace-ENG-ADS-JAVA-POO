import java.util.Scanner;

public class Algorítmo_área_Triangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite Base:");
        double B = leia.nextDouble();
    
        System.out.print("Digite Altura:");
        double H = leia.nextDouble();

        double area = (B*H) / 2;
    
        System.out.println("sua área é:" + area);
    
        leia.close();
    }
}
