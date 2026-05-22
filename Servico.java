//criando a classe

public class Servico {
    private String nome;
    private String tipo;
    private String preco;

//criando construtores

    public Servico(String nome, String tipo, String preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

//criando getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
