import java.util.Scanner;
public class Cadastroproduto {
public static void main(String[] args) {
   Scanner input =  new Scanner(System.in);
  
   System.out.print("Digite o nome do produto: ");
   String nomeproduto = input.nextLine();


   System.out.print("Digite o código do produto: ");
   int codigoproduto = input.nextInt();


   System.out.print("Digite o preço unitário do produto: ");
   double precounitario = input.nextDouble();


   System.out.print("Digite a quantidade em estoque: ");
   int quantidadeestoque = input.nextInt();


   System.out.print("Produto está ativo? (s/n) : ");
   boolean ativo = true;
   char caso = input.next().charAt(0);
   switch (caso) {
       case 'S':
           ativo = true;
       break;
       case 's':
           ativo = true;
       break;
       case 'N':
           ativo = false;
       break;
       case 'n':
           ativo = false;
       break;
       default:
           System.out.println("Opção inválida. Por favor, digite 's' para sim ou 'n' para não.");
           break;
   }
     System.out.println("********INFORMAÇÕES DO PRODUTO********");
     System.out.println("Nome do produto: " + nomeproduto);
     System.out.println("Código do produto: " + codigoproduto);
     System.out.printf("Preço: %.2f\n", precounitario);
     System.out.printf("Valor total em estoque: %.2f\n", (precounitario * quantidadeestoque));
     System.out.print("Produto está ativo: ");
    
   if(ativo == true){
       System.out.print("Sim");
     }else{
       System.out.print("Não");
}
     input.close();
   }
 } 
