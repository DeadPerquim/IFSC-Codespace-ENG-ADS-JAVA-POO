import java.util.Scanner;

public class Conversão_hora_em_minuto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite a hora: ");
        int hora = entrada.nextInt();
    
        int minutos = (hora*60);
    
        System.out.println("resultado em minutos: " + minutos);
    
        entrada.close();
    }
}
