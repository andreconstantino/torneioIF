package torneioif;

import java.util.*;

public class Jogador {

    public Jogador(String nome) {
        this.nome = nome;
    }
    
    private String nome;

    private String rg;

    private String telefone;

    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String novoRg) {
        rg = novoRg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String novoTelefone) {
        telefone = novoTelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String novoEndereco) {
        endereco = novoEndereco;
    }

}