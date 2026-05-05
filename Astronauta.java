package POO.AtividadeAval;

public class Astronauta extends GerenciadorExploracaoEspacial{

    private int ID, Capacidade, Data;
    private String nome, objeto, Tipo,dataLancamento, status, Especialidade;

    public static void adicionarAstronauta(String nome, String especialidade) {
        astronautas.add(new String[]{String.valueOf(proximoIdAstronauta++), nome,
                especialidade});
        System.out.println("Astronauta " + nome + " adicionado com sucesso!");
    }

    public static void listarAstronautas() {
        System.out.println("\n--- Lista de Astronautas ---");
        if (astronautas.isEmpty()) {
            System.out.println("Nenhum astronauta cadastrado.");
            return;
        }
        for (String[] astronauta : astronautas) {
            System.out.println("ID: " + astronauta[0] + ", Nome: " +
                    astronauta[1] + ", Especialidade: " + astronauta[2]);
        }
    }

    public static void listarAstronautas() {
        System.out.println("\n--- Lista de Astronautas ---");
        if (astronautas.isEmpty()) {
            System.out.println("Nenhum astronauta cadastrado.");
            return;
        }
        for (String[] astronauta : astronautas) {
            System.out.println("ID: " + astronauta[0] + ", Nome: " +
                    astronauta[1] + ", Especialidade: " + astronauta[2]);
        }
    }

        public static void associarAstronautaAMissao(String idMissao, String idAstronauta) {
            String nomeAstronauta = "N/A";
            for (String[] astronauta : astronautas) {
                if (astronauta[0].equals(idAstronauta)) {
                    nomeAstronauta = astronauta[1];
                    break;
                }
            }
            for (String[] missao : missoes) {
                if (missao[0].equals(idMissao)) {
                    if (missao[6].equals("N/A")) {
                        missao[6] = nomeAstronauta;
                    } else {
                        missao[6] += ", " + nomeAstronauta;
                    }
                    System.out.println("Astronauta " + nomeAstronauta + "
                            associado à missão ID " + idMissao + " com sucesso!");
                    return;
                }
            }
            System.out.println("Missão ou Astronauta não encontrada."); }
        public static void atualizarStatusMissao(String idMissao, String novoStatus) {
            for (String[] missao : missoes) {
                if (missao[0].equals(idMissao)) {
                    missao[4] = novoStatus;
                    System.out.println("Status da Missão ID " + idMissao + "
                            atualizado para " + novoStatus + " com sucesso!");
                    return;
                }
            }
            System.out.println("Missão não encontrada.");
        }

}
