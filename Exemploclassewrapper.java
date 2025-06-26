public class Exemploclassewrapper {
    public static void main(String[] args) {
        // Declaração de variáveis usando classes wrapper
        Integer numeroInteiro = 10;      // Classe wrapper para int
        Double numeroReal = 5.75;        // Classe wrapper para double
        
        // Exibindo os valores das variáveis
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número real: " + numeroReal);
        
        // Usando métodos das classes wrapper
        System.out.println("Número inteiro em binário: " + Integer.toBinaryString(numeroInteiro));
        System.out.println("Número real arredondado: " + Math.round(numeroReal));
    }
}