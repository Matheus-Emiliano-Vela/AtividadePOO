import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GerenciadorExploracaoEspacial {

// Simula um banco de dados de missões: [ID, Nome, Objetivo, DataLançamento,
  //status]
    ;
    private int ID, Capacidade, Data;
    private String nome, objeto, Tipo,dataLancamento, status, Especialidades;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEspecialidades() {
        return Especialidades;
    }

    public void setEspecialidades(String especialidades) {
        Especialidades = especialidades;
    }
}
