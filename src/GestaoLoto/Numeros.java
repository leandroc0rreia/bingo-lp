/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestaoLoto;

import java.util.Random;
/**
 *
 * @author leandroc0rreia
 */
public class Numeros {
    
    private Random r;
    private int num;

    public Numeros() {
        r = new Random();
        this.num = num;
              
    }
    
    public int getNum() {
        return this.num;
    }
    
    public void sortNumero(){
        this.num = r.nextInt(91 - 1) + 1;
    }
}
