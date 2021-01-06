import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int tempoEvento;
        int horas, minutos, segundos;
        int resto;
        tempoEvento = teclado.nextInt();
        horas = tempoEvento / 3600;
        resto = tempoEvento % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}