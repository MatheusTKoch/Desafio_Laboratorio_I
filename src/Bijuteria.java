public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantMaxProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public String toString() {
        return "Nome da loja: " + getNome() + ", Quantidade de funcionários: " + getQuantidadeFuncionarios() + ", Salário Base dos Funcionários: " + getSalarioBaseFuncionario() + ". " + getEndereco() + "Data de fundação: " + getDataFundacao() + "Meta de vendas(R$): " + metaVendas; 
    }
}
