//criando a classe principal

public class Main {
    public static void main(String[] args) throws Exception {
        Evento e1 = new Evento("Movimento Ágil", "Prédio BB", "28/04/2026", 30);
        Evento e2 = new Evento("Estratégias de IA", "Banco do Brasil Sede 3", "30/04/2026", 55);

        Participante participante = new Participante("João Augusto");

        Evento evento = new Evento();
        evento.adicionarProgramacao("Workshop: Simulador de Modelo Ágil");
        evento.adicionarProgramacao("Teste com Chat GPT");

        participante.realizarInscricao(Evento);

//resultado do cadastro

        System.out.println("\nProgramação cadastrada no evento:");
        e1.adicionarProgramacao("Workshop: Simulador de Modelo Ágil");
    }
}
