public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dia == 29 && mes == 2 && ano % 100 != 0 && ano % 4 == 0 || dia == 29 && mes == 2 && ano % 100 == 0 && ano % 400 == 0) {
            System.out.println("Data inválida!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto() {
        if (ano % 100 != 0 && ano % 4 == 0 || ano % 100 == 0 && ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
