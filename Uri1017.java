import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B;
        double C;
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = (B/12.0)*A;
        System.out.printf("%.3f%n", C);
    }
}