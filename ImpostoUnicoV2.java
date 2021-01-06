import java.util.Scanner;

public class ImpostoUnicoV2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario, imposto;
        
        System.out.println("Digite o salario do funcionario: ");
        salario = teclado.nextDouble();

        if(salario <= 1000.00){
            imposto = 0.0;
        }
        else if(salario <= 1800.00){
            imposto = salario * 10.0/100;
        }
        else if(salario <= 2500.00){
            imposto = salario * 15.0/100;
        }
        else if(salario <= 4000.00){
            imposto = salario * 20.0/100;
        } else{
            imposto = 1300.00;
        }
        
        System.out.printf("Seu salario base: R$ %.2f\n", salario);
        System.out.printf("Imposto Retido: R$ %.2f\n", imposto);
        System.out.printf("Salario Liquido: R$ %.2f\n", salario - imposto);
    }
}