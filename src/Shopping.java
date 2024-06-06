import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantMaxLojas];
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public String toString() {
        return "Nome do Shopping: " + nome + " .Endereco: " + endereco + ". Conjunto de Lojas" + Arrays.toString(lojas);
    }

    public boolean insereLoja(Loja loja) {
        boolean lojaAdicionada = false;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                lojaAdicionada = false;
            }
        }
        return lojaAdicionada;
    }

    public boolean removeLoja(String nome) {
        boolean lojaRemovida = false;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i].getNome().equals(nome)) {
                lojas[i] = null;
                lojaRemovida = true;
            }
        }
        return lojaRemovida;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int correspondencias = 0;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i].getClass().getSimpleName().equals(tipoLoja)) {
                correspondencias ++;
            }
        }
        if (correspondencias == 0) {
            return -1;
        } else {
            return correspondencias;
        }
    }

    // public Loja lojaSeguroMaisCaro() {
    //     Loja lojaComMaiorSeguro;
    //     int maiorSeguro = 0;
    //     for (int i = 0; i < lojas.length; i++) {
    //         if(lojas[i].getClass().getSimpleName().equals("Informatica")) {
    //             lojas[i].seguroEletronicos
    //         }
    //     }
    // }
}
