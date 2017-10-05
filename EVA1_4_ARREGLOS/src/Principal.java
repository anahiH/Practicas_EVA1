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
        int aMisNumeros[] = new int[10];
        for(int i = 0; i<10; i++) {
         aMisNumeros[i] = (int)(Math.random()*10) + 1;   
        }
        //for each
        
        for (int x : aMisNumeros) { //int x; for(int i =0; i<10; i++){}
        System.out.println(" x = " + x);
    }
        
        //MULTIPLES ARREGLOS
        int [] aiArreglo1, aiArreglo2, aiArreglo3; //Todos son arreglos
        aiArreglo1 = new int[3];
        aiArreglo2 = new int[10];
        aiArreglo3 = new int[100];
        
        //ARREGLOS Y VARIABLES
        int aiArre[], iVar, iVar2; // solo aiArre[] es un arreglo
        aiArre = new int[10];
        iVar = 10;
        iVar2 = 30;
                
    }
    
}
