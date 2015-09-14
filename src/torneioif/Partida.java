package torneioif;

import java.util.*;

public class Partida {

    public Partida(int n, Jogador j1, Jogador j2) {
        id = n;
        jogadores[0] = j1;
        jogadores[1] = j2;
    }

    private int id;

    private boolean terminada;

    private Jogador[] jogadores = new Jogador[2];

    private Jogador ganhador;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTerminada() {
        return terminada;
    }

    public void setTerminada(boolean novoEstado) {
        this.terminada = novoEstado;
    }

    public Jogador getGanhador(){
        return ganhador;
    }
    
    public void setGanhador(Jogador ganhador){
        if(ganhador.equals(jogadores[0]) || 
                ganhador.equals(jogadores[1])) {
            this.ganhador = ganhador;
            this.terminada = true;
        }
        else {
            this.ganhador = null;
            this.terminada = false;
        }
    }

    public Jogador getJogador1(){
        return jogadores[0];
    }

    public Jogador getJogador2(){
        return jogadores[1];
    }
}