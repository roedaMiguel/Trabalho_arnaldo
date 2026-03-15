import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        double total = preco * quantidade;

        System.out.println("Total da compra: " + total);

    }
}