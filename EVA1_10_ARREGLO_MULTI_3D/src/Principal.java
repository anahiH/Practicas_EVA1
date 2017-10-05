/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550467
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aim[][][] = new int[3][3][3];
        
        for(int i = 0; i<3; i++) {
            for (int o = 0; o<3; o++) {
                for (int j = 0; j<3; j++) {
                    aim[i][o][j] = (int)(Math.random()*100) + 1;
                }
            }
        }
        
        //IMPRIMIR
        for(int i = 0; i<3; i++) {
            for(int o = 0; o <3; o++) {
                for (int j = 0; j<3; j++) {
                    System.out.print("["+aim[i][o][j]+"]");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        //IMPRIMIR FOR EACH
        for(int[][] aim1 : aim) {
            for(int[] aim2 : aim1) {
                for(int g : aim2) {
                    System.out.print("["+g+"]");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
}
