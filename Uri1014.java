import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X; //Variavel para distancia (Inteiro)
        double Y; //Variavel para consumo (Double)
        double Z; //Variavle para resultado
        
        //Entrada
        X = teclado.nextInt();
        Y = teclado.nextFloat();
        
        //Processamento
        Z = X / Y;

        //Saida
        //Usamos o printf quando preciso exibir as casas decimais
        //"%.3f km/l%n" - 3 casas depois da virgula, inclui km/l após o valor da variavel
        System.out.printf("%.3f km/l%n", Z);
    }
}