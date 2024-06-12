public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public String toString() {
        return "Nome da loja: " + getNome() + ", Quantidade de funcionários: " + getQuantidadeFuncionarios() + ", Salário Base dos Funcionários: " + getSalarioBaseFuncionario() + ". " + getEndereco() + "Data de fundação: " + getDataFundacao() + "Vende produtos importados?: " + ((produtosImportados) ? "Sim" : "Nao"); 
    }
} 
