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
                    String nome = scanner.next();
                    System.out.println("Quantidade de funcionarios: ");
                    int quantFunc = scanner.nextInt();
                    System.out.println("Salario base dos funcionarios: ");
                    double salBase = scanner.nextDouble();
                    System.out.println("Nome da Rua: ");
                    String nomeRua = scanner.next();
                    System.out.println("Cidade: ");
                    String cidade = scanner.next();
                    System.out.println("Estado: ");
                    String estado = scanner.next();
                    System.out.println("Pais: ");
                    String pais = scanner.next();
                    System.out.println("Numero: ");
                    String numero = scanner.next();
                    System.out.println("CEP: ");
                    String cep = scanner.next();
                    System.out.println("Complemento: ");
                    String complemento = scanner.next();
                    System.out.println("Loja cadastrada! Por favor cadastre um produto em seguida");
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
