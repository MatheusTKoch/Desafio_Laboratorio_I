import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");

        Scanner input = new Scanner(System.in);
        try {
            int num = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Opção  inválida");
        }
    }
}
