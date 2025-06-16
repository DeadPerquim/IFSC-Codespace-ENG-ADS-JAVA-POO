import java.util.Scanner;


public class Média_de_quatro_números {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a nota1: ");
        double nota1 = entrada.nextDouble();
    
        System.out.print("Insira a nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Insira a nota3: ");
        double nota3 = entrada.nextDouble();
    
        System.out.print("Insira a nota 4: ");
        double nota4 = entrada.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("sua nota é: " + media);

        entrada.close();
    }    
}
