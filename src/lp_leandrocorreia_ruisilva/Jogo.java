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
        int cart[][] = new int[3][9];
        Random r = new Random();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==0){
                    cart[i][j] = r.nextInt(9)+1;
                }else{
                    if(i==1){
                        cart[i][j] = r.nextInt(9)+1;
                    }else{
                        if(i==2){
                            cart[i][j] = r.nextInt(9)+1;
                        }else{
                            
                        }
                    }
                }
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
      Scanner scn = new Scanner(System.in);
        int tamanho;

        System.out.print("Insira o tamanho da tabela ");
        tamanho = scn.nextInt();

        int[][] duasPos = new int[tamanho][tamanho];

        for (int a = 0; a < duasPos.length; a++){
            for(int b = 0; b < duasPos.length; b++){
                System.out.print("Insira um numero para a posição " + a + "x" + b + " da tabela ");
                duasPos[a][b]= scn.nextInt();
            }
        }

        for (int[] colunas : duasPos){
            for (int i : colunas) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}                    
