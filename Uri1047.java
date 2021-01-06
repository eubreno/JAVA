import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hI, mI, hF, mF, durI, durF, durT, horT, minT;

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        //converte para minutos
        durI = hI *60 + mI;
        durF = hF *60 + mF;

        //subtrai o fim do inicio
        durT = durF -durI;
        if(durT <= 0){ //se o result deu negativo, entao o evento ultrapasosu o dia
            durT = durT + 24*60; //soma 24h porém na unidade minuto
        }

        //converte este tempo de volta em horas/minutos
        horT = durT /60;
        minT = durT % 60;

        System.out.println("O JOGO DUROU ")
    }
}