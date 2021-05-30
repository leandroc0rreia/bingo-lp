/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaobingo;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author leandroc0rreia
 */
public class Numeros {
    
    private ArrayList<Integer> lista;
    private Random r;
    private int num;

    public Numeros() {
        lista = new ArrayList<Integer>();
        r = new Random();
        this.num = num;
              
    }
    
    public int getNum() {
        return this.num;
    }
    
    public void sortNumero(){
        
        if (lista.size() == 0) {
            this.num = r.nextInt(91 - 1) + 1;
            lista.add(num);
        }else{
            this.num = r.nextInt(91 - 1) + 1;
            for (int i = 0; i < lista.size(); i++) {
                if (num == lista.get(i)) {
                    this.num = r.nextInt(91 - 1) + 1;
                    i = 0;
                }
            }
            lista.add(num);
        }
        
    }
    
    public void apagarLista(){
        this.lista.clear();
    }
}
