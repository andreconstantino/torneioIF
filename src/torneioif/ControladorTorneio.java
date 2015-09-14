package torneioif;

import java.util.*;

public class ControladorTorneio {

    public ControladorTorneio() {
        torneio = new Torneio();
    }

    private Torneio torneio;

    public ArrayList<Partida> iniciarTorneio() {
        return torneio.sortearPartidas();
    }

    public void cadastrarJogador(Jogador novoJogador) {
        torneio.adicionarJogador(novoJogador);
    }

    public Jogador exibirVencedorTorneio() {
        if(torneio.isTerminado())
             return torneio.getVencedor();
        else return null;
    }

}