import java.util.Scanner;

public class Ano_para_dias {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
    
        System.out.println("Insira a quantidade de anos: ");
        int anos = entrada.nextInt();
    
        int dias = (anos*365);
    
        System.out.println("Resultado em dias: " + dias);
    
        entrada.close();
    }
}
