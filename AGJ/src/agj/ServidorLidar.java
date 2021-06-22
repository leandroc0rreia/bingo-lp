
package agj;

import java.io.*;
import java.net.*;
/**
 *
 * @author leandroc0rreia
 */
public class ServidorLidar implements Runnable{
    
    private Socket jogador;

    public ServidorLidar(Socket jogador) throws IOException{
        this.jogador = jogador;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
