package torneioif;

import java.util.*;

public class Torneio {

    public Torneio() {
    }

    private boolean terminado;

    private ArrayList partidas = new ArrayList();

    private Jogador vencedor = null;

    private ArrayList jogadores = new ArrayList();

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean novoEstado) {
        terminado = novoEstado;
    }

    public Jogador getVencedor() {
        if(terminado)
            return vencedor;
        else return null;
    }

    public ArrayList<Partida> sortearPartidas() {
        Collections.shuffle(jogadores);
        
        Iterator<Jogador> i = jogadores.iterator();
        int n = 1;
        while(i.hasNext()) {
            Jogador j1 = i.next();
            Jogador j2 = i.next();
            
            Partida p = new Partida(n, j1, j2);
            partidas.add(p);
            
            n++;
        }
        return partidas;
    }

    private boolean verificarTorneioCompleto() {
        if(jogadores.size() == 16)
            return true;
        else return false;
    }

    public void adicionarJogador(Jogador novoJogador){
        this.jogadores.add(novoJogador);
    }
}