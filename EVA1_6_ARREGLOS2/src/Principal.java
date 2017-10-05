
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
    public static final int TAMA_ARRE = 5;
    public static void main(String[] args) {
        // TODO code application logic here
        int aiEdad[];
        aiEdad = new int[TAMA_ARRE];        
        Scanner sCaptu = new Scanner(System.in);
        
        for (int i = 0; i < aiEdad.length; i++) { //en vez de usar .lenght, tambien se puede usar TAMA_ARRE
            System.out.println("Introduce una edad: ");
            aiEdad[i] = sCaptu.nextInt();
        }
        
        //FOR EACH
        for (int x : aiEdad) {
            System.out.println("Edades: " + x);
        }
        
        //CREAR DUPLICADO
        int aiCopiaEdad[];
        aiCopiaEdad = new int[TAMA_ARRE];
        
        for (int o = 0; o < aiEdad.length; o++) {
            aiCopiaEdad[o] = aiEdad[o];
        }
        
        for (int x : aiCopiaEdad) {
            System.out.println("Copia Edad: " + x);
        }
        System.out.println(aiCopiaEdad);
        System.out.println(aiEdad);
                
    }
    
}
