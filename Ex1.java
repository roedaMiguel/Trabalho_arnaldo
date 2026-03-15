import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu cargo: ");
        String cargo = sc.nextLine();

        System.out.println("Bem-vindo ao Sistema Comercial, " + nome + ".");
        System.out.println("Seu acesso como " + cargo + " foi configurado com sucesso.");

    }
}