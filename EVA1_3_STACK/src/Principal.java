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
        System.out.println("LLAMANDO A A");
        A();
        System.out.println("TERMINO LLAMADA A A");
    }
    
    public static void A() {
        System.out.println("LLAMANDO A B");
        B();
        System.out.println("TERMINO LLAMADA A B");
    }
    
    public static void B() {
        System.out.println("LLAMANDO A C");
        C();
        System.out.println("TERMINO LLAMADA A C");
    }
    
    public static void C() {
        System.out.println("FIN DEL CAMINO");
    }
    
}
