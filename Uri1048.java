import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salarioOld, salarioNew, aumento;
        String porcento;
        salarioOld = teclado.nextDouble();
        salarioNew = 0.0;
        aumento = 0.0;
        porcento = "0.0";

        if(salarioOld <= 400.00){
            salarioNew = salarioOld * 15.0/100;
            porcento = "15";
        }else if(salarioOld > 400.00 && salarioOld <= 800.00){
            salarioNew = salarioOld * 12.0/100;
            porcento = "12";
        }else if(salarioOld > 800.00 && salarioOld <= 1200.00){
            salarioNew = salarioOld * 10.0/100;
            porcento = "10";
        }else if(salarioOld > 1200.00 && salarioOld <= 2000.00){
            salarioNew = salarioOld * 7.0/100;
            porcento = "7";
        }else if(salarioOld > 2000.00){
            salarioNew = salarioOld * 4.0/100;
            porcento = "4";
        }
            System.out.printf("Novo salario: %.2f\n", salarioNew + salarioOld);
            System.out.printf("Reajuste ganho: %.2f\n", salarioNew);
            System.out.println("Em percentual: " + porcento + " %");
    }
}