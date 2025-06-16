import java.util.Scanner;

public class Preço_com_desconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor total: ");
        double total = entrada.nextDouble();

        System.out.println("insira o valor do desconto: ");
        double desconto = entrada.nextDouble();

        double totalcomdesconto = (total-desconto);

        System.out.println("Valor total com desconto: " + totalcomdesconto);
        
        entrada.close();
    }
}
