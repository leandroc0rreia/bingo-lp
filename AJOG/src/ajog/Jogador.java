
package ajog;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leandroc0rreia
 */
public class Jogador {
    
    private Socket s;
    private DataInputStream dis;
    private DataOutputStream dos;
    
    // constructor to put ip address and port 
    public Jogador(String address, int port) throws IOException{
        s = new Socket(address, port);
    }
    
    public void start(){
        
        new Thread(){
            
            @Override
            public void run() {
                
                try {
                    dis = new DataInputStream(s.getInputStream());
                    dos = new DataOutputStream(s.getOutputStream());
                    while (true) {
                        
                    }
                    
                } catch (IOException ex) {

                }
            }
            
        }.start();
        
    }
    
    public String receber() throws IOException{
        
        String receber = dis.readUTF();
        System.out.println("Recebi: "+receber);
        
        return receber;
    }
    
    public void enviar(String msg) throws IOException{
        
        dos.writeUTF(msg);
        System.out.println("Enviei: "+msg);

    }
    
}
