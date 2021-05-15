/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author leandroc0rreia
 */
public class Numeros {

    List<Integer> listaNumsAnteriores = new ArrayList<>();
    private int num;

    public Numeros() {
        this.num = 0;
    }
    
    /**
     * Este método numAnt é usado para armazenar os números sorteados
     * exteriormente e quando o utilizador ganhar a lista dos números é limpa.
     *
     * @param numeroQueCalhou é o número sorteado exteriormente.
     */
    public void numAnt(int numeroQueCalhou) {
        listaNumsAnteriores.add(numeroQueCalhou);
        
        for (int c = 0; c < listaNumsAnteriores.size(); c++) {
            System.out.print(listaNumsAnteriores.get(c) + " ");
        }
        if (numeroQueCalhou == 0) {
            listaNumsAnteriores.clear();
        }
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    
}
