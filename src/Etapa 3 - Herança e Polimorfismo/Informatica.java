public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString() {
        return "Nome da loja: " + getNome() + ", Quantidade de funcionários: " + getQuantidadeFuncionarios() + ", Salário Base dos Funcionários: " + getSalarioBaseFuncionario() + ". " + getEndereco() + "Data de fundação: " + getDataFundacao() + "Valor do seguro dos eletrônicos(R$): " + seguroEletronicos; 
    }
}
