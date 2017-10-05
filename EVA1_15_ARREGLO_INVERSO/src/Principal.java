
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
        System.out.println("¿Cuántos datos van a ser?");
        int numDatos = s.nextInt();
        
        int arr[] = new int[numDatos];
        
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Inserte el siguiente número.");
            arr[i] = s.nextInt();
            
        }
        
        System.out.println(arr.length);
        
        int arr1[] = new int[numDatos];
        int a =0;
        for(int i = numDatos; i > 0; i--) {
           arr1[a] = arr[i];
        }    
  }
}
