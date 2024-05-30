import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        boolean lojaCadastrada = false;
        boolean produtoCadastrado = false;
        Data validadePadrao = new Data(20, 10, 2023);

        while (opcao !=3) {

            opcao = Teclado.leInt("(1) criar uma loja (2) criar um produto (3) sair  -  ");
            switch (opcao) {
                case 1:
                    System.out.println("Criação da loja");
                    String nomeLoja = Teclado.leString("Nome da Loja: ");
                    int quantFuncLoja = Teclado.leInt("Quantidade de funcionarios: ");
                    double salBaseLoja = Teclado.leDouble("Salario base dos funcionarios: ");
                    String nomeRua = Teclado.leString("Nome da Rua: ");
                    String cidade = Teclado.leString("Cidade: ");
                    String estado = Teclado.leString("Estado: ");
                    String pais = Teclado.leString("Pais: ");
                    String cep = Teclado.leString("CEP: ");
                    String numero = Teclado.leString("Numero: ");
                    String complemento = Teclado.leString("Complemento: ");
                    int diaFund = Teclado.leInt("Dia da Fundação da loja: ");
                    int mesFund = Teclado.leInt("Mes da Fundação da loja: ");
                    int anoFund = Teclado.leInt("Ano da Fundação da loja ");
                    Data dataFund = new Data(diaFund, mesFund, anoFund);
                    Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
                    Loja loja = new Loja(nomeLoja, quantFuncLoja, salBaseLoja, enderecoLoja, dataFund);
                    System.out.println("Loja cadastrada! Por favor cadastre um produto em seguida");
                    lojaCadastrada = true;
                    break;
                case 2:
                    System.out.println("Criação do produto");
                    String nomeProd = Teclado.leString("Nome do Produto: ");
                    double precoProd = Teclado.leDouble("Preco do produto: ");
                    int diaVal = Teclado.leInt("Dia da validade: ");
                    int mesVal = Teclado.leInt("Mes da validade: ");
                    int anoVal = Teclado.leInt("Ano da validade: ");
                    Data dataValidade = new Data(diaVal, mesVal, anoVal);
                    Produto produto = new Produto(nomeProd, precoProd, dataValidade);
                    System.out.println("Produto Cadastrado!");
                    produtoCadastrado = true;
                    if (lojaCadastrada == true && produtoCadastrado == true) {
                        if (produto.estaVencido(validadePadrao) == true) {
                            System.out.println("PRODUTO VENCIDO");
                        } else {
                            System.out.println("PRODUTO NÃO VENCIDO");
                        }
                        opcao = 3;
                    }
                    break;
                case 3:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção  inválida");   
                }
            }

            
        
        scanner.close(); 
    }
}
