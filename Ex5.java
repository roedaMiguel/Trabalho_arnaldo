import java.util.Scanner;

public class Ex5 { 
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("informe seu salario: ");
        double salario = sc.nextDouble();

        System.out.println("informe quanto voce vendeu esse mes: ");
        double vendas = sc.nextDouble();

        double porcentagem = 5.00;

        double resultado = (vendas * porcentagem) /100;

        double total = (salario + resultado);

        System.out.println("sua comissao é: "+ resultado);
        System.out.println("o valor do seu salario mais a comissao é: "+ total);


    } 

} 