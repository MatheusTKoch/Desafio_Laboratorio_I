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
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {
        boolean lojaRemovida = false;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nome)) {
                lojas[i] = null;
                lojaRemovida = true;
            } else if (lojas[i] == null) {
                lojaRemovida = false;
            }
        }
        return lojaRemovida;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int correspondencias = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                switch (tipoLoja.toLowerCase()) {
                    case "cosmético":
                        if (loja instanceof Cosmetico) {
                            correspondencias++;
                        }
                        break;
                    case "vestuário":
                        if (loja instanceof Vestuario) { 
                            correspondencias++;
                        }
                        break;
                    case "bijuteria":
                        if (loja instanceof Bijuteria) {
                            correspondencias++;
                        } 
                        break;
                    case "alimentação":
                        if (loja instanceof Alimentacao) {
                            correspondencias++;
                        }
                        break;
                    case "informática":
                        if (loja instanceof Informatica) {
                            correspondencias++;
                        }
                        break;
                    default:
                        return -1;
                }
            }
        }
        return correspondencias;
    }

    // public int quantidadeLojasPorTipo(String tipoLoja) {
    //     boolean inputValido = true;
    //     int correspondencias = 0;
    //     for (int i = 0; i < lojas.length; i++) {
    //         switch (tipoLoja) {
    //             case "Cosmetico":
    //                 if (lojas[i] instanceof Cosmetico) {
    //                     correspondencias ++;
    //                 }
    //                 break;
    //             case "Vestuario":
    //                 if (lojas[i] instanceof Vestuario) {
    //                     correspondencias ++;
    //                 }
    //                 break;
    //             case "Bijuteria":
    //                 if (lojas[i] instanceof Bijuteria) {
    //                     correspondencias ++;
    //                 }
    //                 break;
    //             case "Alimentacao":
    //                 if (lojas[i] instanceof Alimentacao) {
    //                     correspondencias ++;
    //                 }
    //                 break;
    //             case "Informatica":
    //                 if (lojas[i] instanceof Informatica) {
    //                     correspondencias ++;
    //                 }
    //                 break;
    //             default:
    //                 inputValido = false;
    //                 break; 
    //         }
    //     }
    //     if (inputValido) {
    //         return correspondencias;
    //     } else {
    //         return -1;
    //     }
    // }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaComMaiorSeguro = null;
        double maiorSeguro = 0;
        for (int i = 0; i < lojas.length; i++) {
            if(lojas[i] instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) lojas[i];
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaComMaiorSeguro = lojaInformatica;
                }
            }
        }
        return lojaComMaiorSeguro;
    }
}
