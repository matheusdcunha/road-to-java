package dev.matheusdcunha.poo.heranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public Endereco(String cep, String rua) {
        this.cep = cep;
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "{" +
                "cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                '}';
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
