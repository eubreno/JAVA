import java.util.Scanner;

public class Uri1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, SOMA; //Variavel do tipo inteiro
        //Entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}