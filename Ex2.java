import java.util.Scanner;
//teste de mesa, explicar parte por parte
public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço de custo: ");
        double custo = sc.nextDouble();

        double precoVenda = custo * 1.25;

        System.out.println("Preço final de venda: " + precoVenda);

    }
}