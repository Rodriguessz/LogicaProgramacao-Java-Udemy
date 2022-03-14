import java.util.Locale;

public class DeclaracaoVar {
    public static void main(String[] args) {
           int idade = 10;  // Declaramos a variavel

           //Exibimos a variavel
           System.out.println(idade);

           //Declaração de var com ponto flutuante 

           double preco = 10.506070;

           //Exibindo a variavel
           System.out.println(preco);

           //Controlando as casas decimais
           System.out.printf("%.2f%n", preco);  

          //Mudando virgula para ponto
         // Locale.setDefault(Locale.US);
          System.out.printf("%.2f%n", preco);
         
          //Concatenando variaveis e Strings
          System.out.println( "O valor do produto é: " + preco + "reais");

          //Concatenando com printf//
         System.out.printf("O valor do produto é : %.2f reais %n", preco);

         //Concatenando varios elementos com atribuições PrintF//
         String nome = "Enzo de Oliveira Rodrigues";
         int anos = 18;
         double salario = 4000.0;
         System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome , anos , salario);

         //EXERCICIOS DE FIXAÇÃO //
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender ='f';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure= 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f %n" , product1 , price1 );
        System.out.printf("%s, which price is $ %.2f %n" , product2 , price2 );

        System.out.printf("Record:");
        System.out.printf("%d years old , %d and gender: %s %n" , age , code, gender); 
        System.out.printf("measure eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n" ,measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f %n" , measure);      

    } 
}
