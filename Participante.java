//chamando biblioteca

import java.util.ArrayList;
import java.util.List;

//criando a classe

public class Participante extends Pessoa {
    private String nome;
    private String CPF;

//criando construtores

    public Participante(String nome, String CPF) {
        super(nome, CPF);
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

//criando acoes

    public void realizarInscricao(Evento evento) {
        evento.add(evento);
    }

    public void consumirServico(Servico servico) {
        servico.add(servico);
    }

    public void escolherAtividade(Atividade atividade) {
        atividade.add(atividade);
    }
}