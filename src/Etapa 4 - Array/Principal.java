import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        boolean lojaCadastrada = false;
        Data validadePadrao = new Data(20, 10, 2023);
        Data dataFund = new Data(0, 0, 0);
        Endereco enderecoLoja =new Endereco(null, null, null, null, null, null, null);
        Loja loja = new Loja(null, 0, enderecoLoja, dataFund, 0);


        System.out.println("\n" + "***********************" + "\n" + "* Gerenciamento do Shopping Center: *" + "\n" + "***********************" + "\n");
        while (opcao !=3) {
            opcao = Teclado.leInt("\n" + "(1) criar uma loja (2) criar um produto (3) sair  -  ");
            switch (opcao) {
                case 1:
                    System.out.println("Criação da loja");
                    String nomeLoja = Teclado.leString("****** Nome da Loja: ");
                    int quantFuncLoja = Teclado.leInt("****** Quantidade de funcionarios: ");
                    double salBaseLoja = Teclado.leDouble("****** Salario base dos funcionarios: ");
                    int quantMaxProdutos = Teclado.leInt("****** Quantidade maxima de produtos em estoque: ");
                    String nomeRua = Teclado.leString("****** Nome da Rua: ");
                    String cidade = Teclado.leString("****** Cidade: ");
                    String estado = Teclado.leString("****** Estado: ");
                    String pais = Teclado.leString("****** Pais: ");
                    String cep = Teclado.leString("****** CEP: ");
                    String numero = Teclado.leString("****** Numero: ");
                    String complemento = Teclado.leString("****** Complemento: ");
                    int diaFund = Teclado.leInt("****** Dia da Fundação da loja: ");
                    int mesFund = Teclado.leInt("****** Mes da Fundação da loja: ");
                    int anoFund = Teclado.leInt("****** Ano da Fundação da loja ");
                    dataFund = new Data(diaFund, mesFund, anoFund);
                    enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
                    loja = new Loja(nomeLoja, quantFuncLoja, salBaseLoja, enderecoLoja, dataFund, quantMaxProdutos);
                    System.out.println("Loja cadastrada! Por favor cadastre um produto em seguida");
                    lojaCadastrada = true;
                    break;
                case 2:
                    System.out.println("Criação do produto");
                    String nomeProd = Teclado.leString("****** Nome do Produto: ");
                    double precoProd = Teclado.leDouble("****** Preco do produto: ");
                    int diaVal = Teclado.leInt("****** Dia da validade: ");
                    int mesVal = Teclado.leInt("****** Mes da validade: ");
                    int anoVal = Teclado.leInt("****** Ano da validade: ");
                    Data dataValidade = new Data(diaVal, mesVal, anoVal);
                    Produto produto = new Produto(nomeProd, precoProd, dataValidade);
                    System.out.println("Produto Cadastrado!");
                    if (lojaCadastrada) {
                        if (produto.estaVencido(validadePadrao)) {
                            System.out.println("PRODUTO VENCIDO");
                        } else {
                            System.out.println("PRODUTO NÃO VENCIDO");
                        }
                        System.out.println(loja.toString());
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
