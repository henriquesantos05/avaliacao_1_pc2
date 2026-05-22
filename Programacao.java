//importando biblioteca

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//criando a classe

public class Programacao {
    private String nome;
    private LocalDateTime horario;
    private List<Participante> capacidadeMaxima;

//criando o construtor
    public Programacao(String nome, LocalDateTime horario, List<Participante> capacidadeMaxima) {
        this.nome = nome;
        this.horario = horario;
        this.capacidadeMaxima = capacidadeMaxima;
    }

//criando getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public List<Participante> getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(List<Participante> capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

//criando acoes

    public void adicionarProfissional(Profissional profissional) {
        profissional.add(profissional);
    }

    public void adicionarAtividade(Atividade atividade) {
        atividade.add(atividade);
    }
}