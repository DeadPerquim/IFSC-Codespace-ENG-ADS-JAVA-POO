import java.util.Scanner;

public class B1_1Teste {
    public static void main(String[] args) {
        Scanner linhadigitada = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String entrada = linhadigitada.nextLine(); // Lê toda a linha de texto

        System.out.println("Você digitou: " + entrada);

        linhadigitada.close();
    }
}

