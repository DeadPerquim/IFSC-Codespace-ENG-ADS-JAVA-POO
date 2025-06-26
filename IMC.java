import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite seu peso (em kg): ");
        double peso = input.nextDouble();
        
        System.out.print("Digite sua altura (em metros): ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Olá %s, seu IMC é: %.2f\n", nome, imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        input.close();
    }    
}
