import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int i, f, duracao;
        i = teclado.nextInt();
        f = teclado.nextInt();
        duracao = f - i;
        if(duracao <= 0){
            duracao = duracao + 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
    }
}