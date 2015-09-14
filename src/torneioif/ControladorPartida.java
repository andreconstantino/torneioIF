package torneioif;

import java.util.*;

public class ControladorPartida {

    public ControladorPartida(Partida p) {
        this.partida = p;
    }

    private Partida partida;

    public Jogador indicarVencedorPartida(Jogador ganhador) {
        if(partida.isTerminada())
            return partida.getGanhador();
        else return null;
    }

}