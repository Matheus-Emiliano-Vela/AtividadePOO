package POO.AtividadeAval;
import java.util.ArrayList;
import java.util.List;

public class Missao extends GerenciadorExploracaoEspacial{

    private int ID, Capacidade, Data;
    private String nome, objeto, Tipo,dataLancamento, status, Especialidade, missao, missoes;


    private static List<String[]> missoes = new ArrayList<>(); // Simula um banco de dados de
    naves: [ID, Nome, Tipo, Capacidade]
    private static List<String[]> naves = new
            ArrayList<>();
    // Simula um banco de dados de astronautas: [ID, Nome, Especialidade]
}
public static void adicionarMissao(String nome, String objetivo, String dataLancamento, String  status) {
    missoes.add(new String[]{String.valueOf(proximoIdMissao++), nome, objetivo,
            dataLancamento, status, "N/A", "N/A"}); // ID Nave, ID Astronautas
            // System.out.println("Missão " + nome + " adicionada com sucesso!"); }

public static void listarMissoes() {
        System.out.println("\n--- Lista de Missões ---");
        if (missoes.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada.");
            return;
        }

        public static void listarMissoes () {
            System.out.println("\n--- Lista de Missões ---");
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


}
