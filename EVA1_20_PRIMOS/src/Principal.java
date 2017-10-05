
import static java.lang.System.in;
import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);
        System.out.println("Inserte el número");
        int num = s.nextInt();
        
        int contador = 0;
        for(int i = 2; i < num/2; i++) {
            int temp = num%i;
           if(temp == 0) {
               contador++;           
           }           
        }
        
        if(contador > 0) {
            System.out.println("El número no es primo.");
        }
        if(contador == 0) {
            System.out.println("El número es primo.");
        }
        
        
    }
    
}
