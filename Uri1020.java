import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade, dias, anos, meses, mesesResto;
        idade = teclado.nextInt();
        anos = idade / 365;
        mesesResto = idade % 365;
        meses = mesesResto / 30;
        dias = mesesResto % 30;

        System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
    }
}