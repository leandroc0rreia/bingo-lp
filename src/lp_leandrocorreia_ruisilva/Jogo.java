/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Leandro Correia
 */
public class Jogo {
    
    public static void sorteador(){
        int cart[][] = new int[9][3];
        Random r = new Random();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                
                if(i==0){
                    cart[i][j] = r.nextInt(9-1)+1;
                }
                if(i==1){
                    cart[i][j] = r.nextInt(19-10)+10;
                }
                if(i==2){
                    cart[i][j] = r.nextInt(29-20)+20;
                }
                if(i==3){
                    cart[i][j] = r.nextInt(39-30)+30;
                }
                if(i==4){
                    cart[i][j] = r.nextInt(49-40)+40;
                }
                if(i==5){
                    cart[i][j] = r.nextInt(59-50)+50;
                }
                if(i==6){
                    cart[i][j] = r.nextInt(69-60)+60;
                }
                if(i==7){
                    cart[i][j] = r.nextInt(79-70)+70;
                }
                if(i==8){
                    cart[i][j] = r.nextInt(90-80)+80;
                }
                System.out.println(cart[i][j]);
            }
        }
    }
    
    public static void cartão(){
        //Gerador de cartão com os números sorteados
        System.out.println("╔═════════╦═════════╦═════════╦═════════╦═════════╦═════════╦═════════╦═════════╦═════════╗");
        System.out.println("║║");
        System.out.println("║║");
        System.out.println("║║");
        System.out.println("╠═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╣");
        System.out.println("║║");
        System.out.println("║║");
        System.out.println("║║");
        System.out.println("╠═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╣");
        System.out.println("║║");
        System.out.println("║║");
        System.out.println("║║");
        System.out.println("╚═════════╩═════════╩═════════╩═════════╩═════════╩═════════╩═════════╩═════════╩═════════╝");
    }
    
    public static void numExt(){
        //Números inseridos anteriormente
        
        Scanner sc = new Scanner(System.in);
        int tamanho;
        
        System.out.print("Números sorteados: \n");
    }
}