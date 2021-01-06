import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B; //Numero do funcionario, quantidade de horas trabalhadas
        double C, D; //Valor recebido por mes
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextDouble();
        D = C * B ;
        System.out.println("NUMBER = " + A);
        System.out.printf("SALARY = U$ %.2f%n", D);
    }
}