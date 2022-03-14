public class TesteProcessamento {
     public static void main(String[] args) {

        // Atribundo variaveis
         int x , y;

        // Processamento de dados
         x = 5;
         y = 2*x;

         // Exibição na tela
         System.out.println("O valor de X é :" + x);
         System.out.println("O valor da expressão é :" + y);

         // Atribuido variaveis
 
        double baseMaior = 8.0;
         double baseMenor = 6.0;
         double h = 5.0;

         // Calculando a área do trapezio
         double  area = (baseMaior+baseMenor)/2.0 *h;
         System.out.println("O valor da área é :" + area);

         // Atribuindo variaveis

         int a ,b;
         double resultado;
         a = 5;
         b =2; 
         resultado = a/b;
         System.out.println("O resultado da expressão é:" + resultado);

         // O mesmo exeplo porem utilizando o casting //

         int c ,d;
         double result;
         c = 5;
         d= 2;
         result = (double) c/d;
         System.out.println("O resultado da expressão é:" + result);

           // Outra prática com casting // 

     double teste; 
     int resulTeste;

     teste = 5.0;
     resulTeste = (int)teste;
     System.out.println(resulTeste);

     }
}
   
