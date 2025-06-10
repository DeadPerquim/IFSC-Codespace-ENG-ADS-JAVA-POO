import java.util.Scanner;

public class B1_3Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInt = entrada.nextInt(); // Lê um número inteiro
        System.out.println("Você digitou o inteiro: " + numeroInt);

        System.out.print("Digite um número decimal (double): "); 
        double numeroDouble = entrada.nextDouble(); // Lê um número double System.out.println("Você digitou o double: " + numeroDouble);
        System.out.println("Você digitou o double: " + numeroDouble);
        entrada.close();
    }
}

