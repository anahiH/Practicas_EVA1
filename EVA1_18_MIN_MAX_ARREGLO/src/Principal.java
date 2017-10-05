
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
        //buscar el valor mínimo y maximo
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuántos datos van a ser?");
        int numDatos = s.nextInt();
        
        int arr[] = new int[numDatos];
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Inserte el siguiente número.");
            arr[i] = s.nextInt();            
        }
        //max valor
        
        int maxValor = arr[0];       
        for(int i = 1; i<arr.length; i++) {
            if (arr[i] >= maxValor) {
                maxValor = arr[i];
                
            }
            
        }
        
        System.out.println("El valor máximo es " + maxValor);
        
        
        int minValor = arr[0];
        for(int o = 1; o<arr.length; o++) {
            if(arr[o] <= minValor) {
                minValor = arr[o];
                
            }
            
        }
        System.out.println("El valor mínimo es " + minValor);
        
    

    }
    
}
