//criando a classe

public class Evento {
    private String nome;
    private String local;
    private Date   data;
    private Integer capacidade;

//criando construtores

    public Evento(String nome, String local, Date data, Integer capacidade) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.capacidade = capacidade;
    }

//criando getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

//criando acoes

    public void adicionarProgramacao(Programacao programacao) {
        programacao.add(programacao);
    }

}