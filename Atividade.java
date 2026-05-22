//criando a classe

public class Atividade {
    private String nome;
    private String tipo;
    private List<Participante> participantes; //quantidade de participantes

//criando construtores

    public Atividade(String nome, String tipo, List<Participante> participantes) {
        this.nome = nome;
        this.tipo = tipo;
        this.participantes = participantes;
    }

//criando getters e setters

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

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

//criando acoes

     public void adicionarProfissional(Profissional profissional) {
        profissional.add(profissional);
    }

}