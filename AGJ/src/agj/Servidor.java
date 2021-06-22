
package agj;

import java.net.*;
import java.io.*;
import java.util.Vector;

/**
 *
 * @author leandroc0rreia
 */
public class Servidor {
    
    // initialize socket and input output streams 
    private Socket s;
    private ServerSocket ss;
    static Vector<ServidorLidar> vec = new Vector<ServidorLidar>();
    static int i = 0;
    

    public Servidor(int port) throws IOException {
       
        try {
            
        } catch (Exception e) {
        }
        while (true) {            
            ss = new ServerSocket(port);
       
            System.out.println("[SERVER] Servidor aberto");
            Socket jogador = ss.accept();
            System.out.println("[SERVER] Jogador conectado" + jogador);
            ServidorLidar jogadorThread = new ServidorLidar(jogador);
            vec.add(jogadorThread);
        }
       
    }
    
}