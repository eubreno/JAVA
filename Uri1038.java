import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codItem, qtdItem;
        double total;
        total = 0.0;

        //System.out.println("Digite o codigo do Item: ");
        codItem = teclado.nextInt();
        //System.out.println("Digite a quantidade do Item: ");
        qtdItem = teclado.nextInt();

        if(codItem == 1){
            total = qtdItem * 4.00;
        } else if(codItem == 2){
            total = qtdItem * 4.50;
        } else if (codItem == 3){
            total = qtdItem * 5.00;
        } else if(codItem == 4){
            total = qtdItem * 2.00;
        } else if(codItem == 5){
            total = qtdItem * 1.50;
        }

        System.out.printf("Total: R$ %.2f\n", total);
    }
}