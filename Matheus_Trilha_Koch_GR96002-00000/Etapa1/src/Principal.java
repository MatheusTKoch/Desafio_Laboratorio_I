import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("(1) criar uma loja");
        System.out.println("(1) criar um produto");
        System.out.println("(3) sair");

        Scanner input = new Scanner(System.in);
        try {
            int num = input.nextInt();
            if (num == 1) {
                System.out.println("Criação da loja");
            } else if (num == 2) {
                System.out.println("Criação do produto");
            } else if (num == 3) {
                input.close();
            } else {
                System.out.println("(1) criar uma loja");
                System.out.println("(1) criar um produto");
                System.out.println("(3) sair");
            }
        } catch (InputMismatchException e) {
            System.out.println("Opção  inválida");
            System.out.println("(1) criar uma loja");
            System.out.println("(1) criar um produto");
            System.out.println("(3) sair");
        }
        
    }
}
