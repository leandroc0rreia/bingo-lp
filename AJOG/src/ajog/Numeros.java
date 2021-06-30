/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajog;

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
    
    /**
     * Construtor da classe Numeros
     */
    public Numeros() {
        lista = new ArrayList<Integer>();
        r = new Random();
        this.num = num;
              
    }
    
    /**
     * Retorna o número da classe
     * @return 
     */
    public int getNum() {
        return this.num;
    }
    
    /**
     * Sorteia o número
     */
    public void sortNumero(){
        
        //Cria o primeiro número da lista
        if (lista.size() == 0) {
            this.num = r.nextInt(91 - 1) + 1;
            lista.add(num);
        }else{
            //Sorteia o número e depois verifica se é repetido na lista
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
    
    /**
     * Apaga todos os elementos da lista de números sorteados
     */
    public void apagarLista(){
        this.lista.clear();
    }
}
