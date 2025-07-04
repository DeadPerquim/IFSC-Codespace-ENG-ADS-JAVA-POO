
public class G1_3Teste {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str3 = "ghi";
       
        // Usando método .concat()
        str1 = str1.concat(str2);
        System.out.println("str1 = " + str1);
       
        // Usando o operador + para concatenar
        str1 = str1 + str3;
        System.out.println("str1 = " + str1);
    }
}

