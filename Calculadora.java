
import java.util.Scanner;

public class Calculadora {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int opcao;

do {
System.out.println("Menu: Digite o item");
System.out.println("1 - Somar");
System.out.println("2 - Subtrair");
System.out.println("3 - Multiplicar");
System.out.println("4 - Dividir");
System.out.println("0 - Sair");

opcao = entrada.nextInt();

switch (opcao) {
case 1:
somar(entrada);
break;
case 2:
subtrair(entrada);
break;
case 3:
multiplicar(entrada);
break;
case 4:
dividir(entrada);
break;
case 0:
System.out.println("Saindo...");
break;
default:
System.out.println("Opção inválida! Tente novamente.");
}

} while (opcao != 0); // O loop continua enquanto o usuário não digitar 0

entrada.close();
}

private static void somar(Scanner entrada) {
System.out.print("Digite o primeiro número: ");
double num1 = entrada.nextDouble();
System.out.print("Digite o segundo número: ");
double num2 = entrada.nextDouble();
double resultado = num1 + num2;
System.out.println("Resultado: " + resultado);
}

private static void subtrair(Scanner entrada) {
System.out.print("Digite o primeiro número: ");
double num1 = entrada.nextDouble();
System.out.print("Digite o segundo número: ");
double num2 = entrada.nextDouble();
double resultado = num1 - num2;
System.out.println("Resultado: " + resultado);
}

private static void multiplicar(Scanner entrada) {
System.out.print("Digite o primeiro número: ");
double num1 = entrada.nextDouble();
System.out.print("Digite o segundo número: ");
double num2 = entrada.nextDouble();
double resultado = num1 * num2;
System.out.println("Resultado: " + resultado);
}

private static void dividir(Scanner entrada) {
System.out.print("Digite o primeiro número: ");
double num1 = entrada.nextDouble();
System.out.print("Digite o segundo número: ");
double num2 = entrada.nextDouble();
if (num2 == 0) {
System.out.println("Erro: Não é possível dividir por zero!");
} else {
double resultado = num1 / num2;
System.out.println("Resultado: " + resultado);
}
}
}
