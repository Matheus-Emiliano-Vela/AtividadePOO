package POO.AtividadeAval.Abstracao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NaveEspacial extends GerenciadorExploracaoEspacial {
    private String tipo;
    private int capacidade;

    public NaveEspacial(int id, String nome, String tipo, int capacidade) {
        super(id, nome);
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public void exibirInformacoes() {
       super.exibirInformacoes();
    }
}