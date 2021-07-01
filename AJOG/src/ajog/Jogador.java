
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
    
    // constructor to put ip address and port 
    public Jogador(String address, int port) throws IOException{
        s = new Socket(address, port);
    }
    
    public void start(){
        
        try {
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
        } catch (IOException ex) {

        }
        
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
