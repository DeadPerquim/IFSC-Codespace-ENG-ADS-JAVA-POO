import java.util.Scanner;
/* o "java" não se escreve antes do import.*/
/* faltou o ";" depois do "Scanner" */

public class Temperatura {
    public static final int CONVERSAO = 32; // Constante para conversão de Celsius para Fahrenheit
    public static final int CONVERSAO_KELVIN = 273; // Constante para conversão de Celsius para Kelvin
    /* A constante deve ser declarada antes do inicio do código (mais especificamente antes do "public static void main(String[] args) */
    /* Além de que a constante deve ser acompanhada do "public static" */
    /* para fazer o cálculo de conversão de celsius para kelvin é necessário declarar uma outra constante para essa função antes de começar o código. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();
        /*Se o valor é do tipo double, então o método dever ser ".nextDouble()". Não pode ser ".nextInt()" pois ele é usado para valores do tipo Int. */
        
        double fahrenheit = celsius * 9/5 + CONVERSAO;
        
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
       /* Não é necessário definir um valor para CONVERSAO_KELVIN pois já foi definido como constante antes de começar o código. */
        double kelvin = celsius + CONVERSAO_KELVIN;
        
        System.out.println("Temperatura em Kelvin: " + kelvin);
    input.close(); // Fechar o scanner para evitar vazamento de recursos
    /* faltou o comando "input.close()" para finalizar o uso do da classe Scanner */
    }
}

