import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        //usar classe Teclado para refatorar o codigo abaixo ao pedir os inputs

        while (opcao !=3) {
            opcao = Teclado.leInt("(1) criar uma loja (2) criar um produto (3) sair");
        
            if(scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Criação da loja");
                    String nome = Teclado.leString("Nome da Loja: ");
                    int quantFunc = Teclado.leInt("Quantidade de funcionarios: ");
                    double salBase = Teclado.leDouble("Salario base dos funcionarios: ");
                    String nomeRua = Teclado.leString("Nome da Rua: ");
                    String cidade = Teclado.leString("Cidade: ");
                    String estado = Teclado.leString("Estado: ");
                    String pais = Teclado.leString("Pais: ");
                    String numero = Teclado.leString("Numero: ");
                    String cep = Teclado.leString("CEP: ");
                    String complemento = Teclado.leString("Complemento: ");
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
