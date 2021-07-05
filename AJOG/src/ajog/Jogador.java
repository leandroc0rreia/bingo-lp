package ajog;

import java.net.*;
import java.io.*;

/**
 *
 * @author leandroc0rreia
 */
public class Jogador {

    private Socket s;
    private DataInputStream dis;
    private DataOutputStream dos;

    /**
     * Construtor da classe jogador que tem como parametros o ip e porta
     *
     * @param address
     * @param port
     * @throws IOException
     */
    public Jogador(String address, int port) throws IOException {
        s = new Socket(address, port);
    }

    /**
     * Start do jogador
     */
    public void start() {

        try {
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
        } catch (IOException ex) {

        }

    }

    /**
     * Recebe texto do servidor
     *
     * @return
     * @throws IOException
     */
    public String receber() throws IOException {

        String receber = dis.readUTF();
        System.out.println("Recebi: " + receber);

        return receber;
    }

    /**
     * Envia texto ao servidor
     *
     * @param msg
     * @throws IOException
     */
    public void enviar(String msg) throws IOException {

        dos.writeUTF(msg);
        System.out.println("Enviei: " + msg);

    }

    /**
     * Fecha os DataInputStream e DataOutputStream
     */
    public void stop() {
        try {
            dis.close();
            dos.close();
        } catch (IOException ex) {

        }
    }
}
