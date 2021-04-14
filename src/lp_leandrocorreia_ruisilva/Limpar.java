/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;

import java.io.IOException;

/**
 * A classe <b>Limpar</b> consiste na limpeza da consola Windows ou Linux.
 * @author Leandro_Correia e Rui_Silva
 * @version v1.0
 */
public class Limpar {

    /**
     * Este método limpa a consola/terminal.
     */
    public static void limparConsola() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
            }
        } catch (IOException | InterruptedException ex) {
        }
    }
}
