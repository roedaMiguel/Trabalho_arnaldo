import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println("informe o valor da compra: ");
         double valor= sc.nextDouble();

         double desconto = valor * 0.15;
         double valorfinal = valor - desconto;

         System.out.println("valor do desconto: " + desconto);
         System.out.println("valor final da compra: " +valorfinal);



      }  
}
