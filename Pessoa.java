//criando a classe

public class Pessoa {
    private String nome;
    private String CPF;

//criando construtores

    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

//criando getters e setters

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}