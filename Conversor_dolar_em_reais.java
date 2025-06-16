import java.util.Scanner;

public class Conversor_dolar_em_reais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o Valor em dolares: ");
        double dolares = entrada.nextInt();
    
        double reais = (dolares*5.64);
    
        System.out.println("Resultado em reais: " + reais);
    
        entrada.close();
    }
}
