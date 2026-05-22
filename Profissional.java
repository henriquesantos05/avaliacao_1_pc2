//criando a classe

public class Profissional extends Pessoa {
    private String nome;
    private String CPF;
    private String area;

//criando construtores

    public Profissional(String nome, String CPF, String area) {
        super(nome, CPF);
        this.area = area;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
