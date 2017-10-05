
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
        //bucar el numero de repeticiones del arreglo
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuántos datos van a ser?");
        int numDatos = s.nextInt();
        
        int arr[] = new int[numDatos];
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Inserte el siguiente número.");
            arr[i] = s.nextInt();            
        }
        
        System.out.println("Inserte el número que desea buscar.");
        int numero = s.nextInt();
        
        int contador = 0;
        int i;
        for(i = 0; i<arr.length; i++) {
            if(arr[i] == numero) {
                contador++;
            }
        }
        
        System.out.println("El número " + numero + " se repite " + contador + " veces");
        
    }
    
}
