
package agj;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author leandroc0rreia
 */
public class Servidor {
    
    // initialize socket and input output streams 
    private Socket jogador;
    private ServerSocket ss;
    
    private ArrayList<DataInputStream> tunelReceber;
    private ArrayList<DataOutputStream> tunelEnvio;
    
    private ArrayList<Socket> listaJogadores;

    public Servidor() throws IOException {
        listaJogadores = new ArrayList<>();
    }
    
    public void start(int port) throws IOException{
        
        ss = new ServerSocket(port);
        jogador = new Socket();
        
        tunelReceber = new ArrayList<>();
        tunelEnvio = new ArrayList<>();
        
        System.out.println("[SERVER] Servidor aberto");
        while (true) {            
            
            jogador = ss.accept();
            System.out.println("[SERVER] Jogador conectado " + jogador);
            listaJogadores.add(jogador);
            
            
            new Thread(){
                @Override
                public void run() {
                    
                    try {
                        DataInputStream dis = new DataInputStream(jogador.getInputStream());
                        DataOutputStream dos = new DataOutputStream(jogador.getOutputStream());
                        
                        tunelEnvio.add(dos);
                        tunelReceber.add(dis);
                        
                        System.out.println("Recebi: "+dis.readUTF());
                        while (true) {
                            
                        }
                    } catch (Exception e) {
                        
                    }
                    
                    
                }
            }.start();
        }
        
    }
    
    
    public Vector<String> receber() throws IOException{
        
        Vector<String> listaReceber = new Vector<>();
        
        for (DataInputStream tr : tunelReceber) {
            String mensagem = tr.readUTF();
            listaReceber.add(mensagem);
            System.out.println("Enviei: "+mensagem);
        }
        
        return listaReceber;
    }
    
    public void enviar(String msg) throws IOException{
        
        for (DataOutputStream te : tunelEnvio) {
            te.writeUTF(msg);
            System.out.println("Enviei: "+ msg);
        }

    }
    
}