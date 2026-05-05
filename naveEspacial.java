package POO.AtividadeAval;

public class naveEspacial extends GerenciadorExploracaoEspacial{

    private int ID, Capacidade, Data;
    private String nome, objeto, Tipo, dataLancamento, status, Especialidade;

    public static void adicionarNave(String nome, String tipo, String capacidade) {
        naves.add(new String[]{String.valueOf(proximoIdNave++), nome, tipo, capacidade});
        System.out.println("Nave " + nome + " adicionada com sucesso!"); }


    public static void listarNaves() {
        System.out.println("\n--- Lista de Naves Espaciais ---"); if (naves.isEmpty()) {
            System.out.println("Nenhuma nave cadastrada.");
            return;
        }
        for (String[] nave : naves) {
            System.out.println("ID: " + nave[0] + ", Nome: " + nave[1] + ", Tipo: " + nave[2] + ",
                    Capacidade: " + nave[3]);
        }
    }

    public static void associarNaveAMissao(String idMissao, String idNave) {
        String nomeNave = "N/A";
        for (String[] nave : naves) {
            if (nave[0].equals(idNave)) {
                nomeNave = nave[1];
                break;
            }
        }
        for (String[] missao : missoes) {
            if (missao[0].equals(idMissao)) {
                missao[5] = nomeNave; // Atualiza o nome da nave na missão
                System.out.println("Nave " + nomeNave + " associada à missão ID " + idMissao + " com sucesso!");
                return;
            }
        }
        System.out.println("Missão ou Nave não encontrada.");

    }

}
