import java.util.Scanner;

public class Conversão_minuto_em_hora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print ("Digite os minutos: ");
        int minutos = entrada.nextInt();

        int horas = (minutos/60);

        System.out.println("Resultado em horas: " + horas);

        entrada.close();
    }
}
