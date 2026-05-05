package POO.AtividadeAval;
import java.util.ArrayList;
import java.util.List;

public class Missao extends GerenciadorExploracaoEspacial{

    private int ID;
    private int Capacidade;
    private int Data;
    private static int proximoIdMissao;
    private String nome;
    private String objeto;
    private String Tipo;
    private String dataLancamento;
    private String status;
    private String Especialidade;
    private String missao;
  


public static void adicionarMissao(String nome, String objetivo, String dataLancamento, String  status) {
    missoes.add(new String[]{String.valueOf(proximoIdMissao++), nome, objetivo,
            dataLancamento, status, "N/A", "N/A"}); // ID Nave, ID Astronautas
            System.out.println("Missão " + nome + " adicionada com sucesso!"); }
    
        public static void listarMissoes () {
            System.out.println("\n--- Lista de Missões ---");
            String[][] missoes;
            if (missoes.isEmpty()) {
                System.out.println("Nenhuma missão cadastrada.");
                return;
            }
            for (String[] missao : missoes) {
                System.out.println("ID: " + missao[0] + ", Nome: " + missao[1] + ", Objetivo: " +
                        missao[2] + ", Data: " + missao[3] + ", Status: " + missao[4] + ", Nave: " + missao[5] + ", Astronautas: "

                        + missao[6]);
            }
    }



}
