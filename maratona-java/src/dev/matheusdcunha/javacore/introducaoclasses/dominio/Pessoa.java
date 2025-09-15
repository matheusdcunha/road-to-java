package dev.matheusdcunha.javacore.introducaoclasses.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private int altura;

    public Pessoa(String nome, int idade, char sexo, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
    }

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.sexo = 0;
        this.altura = 0;
    }

    public void exibirDescricao(){
        System.out.println("Meu nome é: " + this.nome);
        System.out.println("Tenho: " + this.idade + " anos");
    }

    private int calcularAniversario(){
        return 2025 - this.idade;
    }

    public void exibirInformacoes(){
        System.out.println("Meu nome é " + this.nome + ", tenho " + this.idade + " anos e nasci em " + calcularAniversario());
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
