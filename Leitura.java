//Importar a biblioteca de componentes scanner que esta disponivel no pacote UTIL da liguagem JAVA
import java.util.Scanner;

public class Leitura{
    public static void main (String args []){
        //Passo 1 - decalarar um componente (uma variavel) do tipo Scanner
        Scanner teclado;
        //Passo 2 - indicar que o scanner vai ler do teclado
        teclado = new Scanner(System.in);
        //Criacao de duas variaveis sem valores, uma do tipo inteiro e uma do tipo double
        int a;
        double b;
        //Interacao com o usuario para digitar um valor inteiro e armazenar na variavel a
        System.out.println("Por favor digite um valor inteiro");
        a = teclado.nextInt();
        //Interacao com o usuario para digitar um valor inteiro e armazenar na variavel b
        System.out.println("Por favor digite um valor real");
        b = teclado.nextDouble();
        //Exibe na tela os valores digitados anteriormente
        System.out.println("Voce digitou os valores " + a + " e " + b);
    }
}