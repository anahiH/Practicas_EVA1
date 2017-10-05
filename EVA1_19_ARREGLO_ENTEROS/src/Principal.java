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
        int aiMillion[] = new int[300000000];
        for(int i = 0; i < aiMillion.length; i++) {
            aiMillion[i] = (int)(Math.random() * 100) +1;
        }
    }
    
}
