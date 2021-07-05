package agj;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author leandroc0rreia
 */
public class Servidor {

    private Socket jogador;
    private ServerSocket ss;

    private ArrayList<DataInputStream> tunelReceber;
    private ArrayList<DataOutputStream> tunelEnvio;

    private Hashtable<String, Double> jogApostas;
    private int contJog;
    private ArrayList<Socket> listaJogadores;
    private int numVenc;

    private Hashtable<String, String> hash;

    /**
     * Construtor do Servidor
     *
     * @throws IOException
     */
    public Servidor() throws IOException {
        listaJogadores = new ArrayList<>();
        this.contJog = 0;
        this.numVenc = 0;
    }

    /**
     * Start do servidor
     *
     * @param port
     * @throws IOException
     */
    public void start(int port) throws IOException {

        ss = new ServerSocket(port);
        jogador = new Socket();

        tunelReceber = new ArrayList<>();
        tunelEnvio = new ArrayList<>();
        jogApostas = new Hashtable<>();
//        hash = new Hashtable<>();

        System.out.println("[SERVER] Servidor aberto");

        while (true) {

            jogador = ss.accept();
            System.out.println("[SERVER] Jogador conectado " + jogador);
            listaJogadores.add(jogador);

            new Thread() {
                @Override
                public void run() {

                    try {
                        DataInputStream dis = new DataInputStream(jogador.getInputStream());
                        DataOutputStream dos = new DataOutputStream(jogador.getOutputStream());

                        tunelEnvio.add(dos);
                        tunelReceber.add(dis);

//                        String hashJog = dis.readUTF();
//                        hash.put(String.valueOf(jogApostas.size()+1), hashJog);
                        String valor = dis.readUTF();
                        jogApostas.put(String.valueOf(jogApostas.size() + 1), Double.valueOf(valor));

                        while (true) {

                        }
                    } catch (Exception e) {

                    }
                }
            }.start();
        }
    }

    /**
     * Recebe o texto do jogador
     *
     * @return vector
     * @throws IOException
     */
    public Vector<String> receber() throws IOException {

        Vector<String> listaReceber = new Vector<>();

        for (DataInputStream tr : tunelReceber) {
            String mensagem = tr.readUTF();
            listaReceber.add(mensagem);
            System.out.println("Recibi: " + mensagem);
        }

        return listaReceber;
    }

    /**
     * Envia texto ao jogador
     *
     * @param msg
     * @throws IOException
     */
    public void enviar(String msg) throws IOException {

        for (DataOutputStream te : tunelEnvio) {
            te.writeUTF(msg);
            System.out.println("Enviei: " + msg);
        }

    }

    /**
     * Objetem o número do jogador e o valor da aposta
     *
     * @return
     */
    public Hashtable<String, Double> getJogApostas() {
        return jogApostas;
    }

    /**
     * Devolve o valor a receber quando faz bingo
     *
     * @return
     */
    public double totalApostas() {

        double total = 0;
        for (Map.Entry<String, Double> ja : jogApostas.entrySet()) {
            total = total + ja.getValue();
        }

        double percentCasa = total - (total * 0.20);

        double valorGanho = percentCasa / numVenc;

        return valorGanho;
    }

    /**
     * Soma o total de vencedores com bingo
     *
     * @param num
     */
    public void somaVencedor(int num) {
        this.numVenc = num;
    }

    /**
     * Resete aos jogadores
     */
    public void removeJogadores() {
        jogApostas.clear();
    }

    /**
     * Reset às variaveis da classe Servidor
     *
     * @throws IOException
     */
    public void resetVariaveis() throws IOException {
        contJog = 0;
        listaJogadores.clear();

        for (DataInputStream dataInputStream : tunelReceber) {
            dataInputStream.close();
        }
        for (DataOutputStream dataOutputStream : tunelEnvio) {
            dataOutputStream.close();
        }
        ss.close();
    }
}
