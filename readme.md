Arquivo DeclaracaoVar :
Para controlarmos as casas decimais utilizamos o comando "System.out.printf" F de formatação;
Para decidirmos quantas casas iremos querer, usamos ele desse forma System.out.printf("%.QauntidadeCasasf%n);
Exemplo : 2 casas decimais = System.out.printf("%.2f%n);

// MUDANDO A VIRGULA PARA PONTO//
Podemos mudar a virgula para um ponto usando o comando Locale.setDefault(Locale.LocalDaLingua);
Exemplo : Mude para ponto = Locale.setDefault(locale.US);
Dessa forma conseguimos mudar nosso idioma do teclado.

//CONCATENANDO COM O PRINTF//

Concatenamos da mesma forma, porém adicionando a formatação que eu quero;
Exemplo :  System.out.printf("O valor do produto é : %.2f reais %n", preco);
O valor da variavel entra em %.2f;

//CONCATENANDO COM O PRINTF PASSANDO ATRIBUTOS//
Podemos concatenar dessa outra forma: System.out.printf("%s tem %d anos e ganha %.2f reias %n);

%s = String;
%d = numeros inteiros;
%f = numeros com ponto flutuante;
%n = quebra de linha;


Arquivo TesteProcessamento :

// CASTING , COVERSÃO DE VALORES DE FORMA EXPLICITA //
Exemplo : declaramos duas var do tipo inteiro 

int a , b;

a = 5;
b = 2;
E declaramos uma var do tipo double para o resultado da expressao

Se executarmos a seguinte expressão, o resultado será exibido como um valor inteiro, pois o programa entende que precisa mandar o resultado em inteiro;

resultado = a/b;
resultado = 2.0;

Para fazermos a prática do casting , basta utilizarmos o (Double) antes da conta;
 resultado = (double) a/b;

 Podemos utilizar o casting quando queremos passar uma var double para int , mas somente quando nao nos importa perder as casas decimais :
  Exemplo : 
  double teste; 
     int resulTeste;

     teste = 5.0;
     resulTeste = (int)teste;
     System.out.println(resulTeste);
     
     resulTeste = 5; (Sem a casa decimal)
