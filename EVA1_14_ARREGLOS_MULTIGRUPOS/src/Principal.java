
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
        System.out.println("¿Cuantos grupos se van a ingresar?");
        int iGrupo = s.nextInt();
        
        int ar[][] = new int[iGrupo][];
        
        //número de grupos
        for(int i = 0; i<iGrupo; i++) {
            System.out.println("Inserte el tamaño del grupo " + (i+1));
            ar[i] = new int[s.nextInt()];            
        }
        
        //edades
        for(int i = 0; i<iGrupo; i++) {
            for(int o = 0; o<ar[i].length; o++) {
                System.out.println("Inserte la siguiente edad del grupo " + (i+1) + ":");
                ar[i][o] = s.nextInt();
            }
        }
        
        //imprimir como matriz
        for(int[] ar1 : ar) {
            for(int g : ar1) {
                System.out.print("["+g+"]");
            }
            System.out.println("");                    
        }
        
        //PARA PEDIR UNA ESPECÍFICA EDAD
        System.out.println("Inserte número de grupo");
        int grupo = s.nextInt() -1;
        
        System.out.println("Inserte número de alumno");
        int alum = s.nextInt() - 1;
        
        System.out.println(ar[grupo][alum]);
        
    }
    
}
