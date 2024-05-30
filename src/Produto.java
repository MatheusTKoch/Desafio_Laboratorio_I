public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String toString() {
        return "Nome do produto: " + nome + ", Preço de venda: " + preco;
    }

    public boolean estaVencido(Data validade) {
        if (dataValidade.getAno() < validade.getAno() || 
        dataValidade.getAno() == validade.getAno() && dataValidade.getMes() < validade.getMes() ||
        dataValidade.getAno() == validade.getAno() && dataValidade.getMes() == validade.getMes() && dataValidade.getDia() < validade.getDia()) {
            return true;
        } else {
            return false;
        }
    }
}
