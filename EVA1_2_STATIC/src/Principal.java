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
        MiclasePrueba mcpObjeto = new MiclasePrueba();
        mcpObjeto.imprimirMensaje();
        System.out.println(mcpObjeto.sNom);
        
        MiclasePrueba2.imprimirMensaje();
        MiclasePrueba2.sNom = "REBECA ANAHI";
        System.out.println(MiclasePrueba2.sNom);
    }
    
}

class MiclasePrueba {
    public String sNom = "Anahi";
    public void imprimirMensaje(){
        System.out.println("Hola mundo!!");
    }
}

class MiclasePrueba2 {
    public static String sNom = "Anahi";
    public static void imprimirMensaje(){
        System.out.println("Hola mundo!!");
    }
}
