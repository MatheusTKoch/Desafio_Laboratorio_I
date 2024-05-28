import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao !=3) {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
        
            if(scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Criação da loja");
                    System.out.println("Nome da Loja: ");
                    break;
                case 2:
                    System.out.println("Criação do produto");
                    break;
                case 3:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção  inválida");   
                }
            } else {
                System.out.println("Opção  inválida");
                scanner.next();
            }
            System.out.println(); 
        }
        scanner.close(); 
    }
}
