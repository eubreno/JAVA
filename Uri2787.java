import java.util.Scanner;

public class Uri2787{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int l, c, resto;
        l = teclado.nextInt();
        c = teclado.nextInt();
        resto = (l + c) % 2;
        if(resto != 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}