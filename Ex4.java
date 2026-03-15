import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos dolares voce gostaria de converter: ");
        double dolar = sc.nextDouble();

        System.out.println("qual a cotação atual do real: ");
        double cotacao = sc.nextDouble();

        double reias = dolar * cotacao;
        System.out.println("valor em reais é: "+ reias);
        
   }
}