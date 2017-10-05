/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550467
 */
public class Objeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5; //asigenemos el valor de i
        System.out.println("i = " + i);
        //crear una copia de i
        int iCopia = i; 
        
        System.out.println("Copia de i = " + iCopia);
        i++;
        System.out.println("i++ = " + i);
        System.out.println("iCopia = " + iCopia);
        
        //declarar objeto tipo numero
        
        Numero nVal = new Numero();
        System.out.println("Valor de nVal.i = " + nVal.i);
        
        Numero nCopiaVal = nVal;
        System.out.println("Valor de nCopiaVal.i = " + nCopiaVal.i);
        
        nVal.i++;
        System.out.println("nVal.i++ = " + nVal.i);
        System.out.println("nCopiaVal.i = " + nCopiaVal.i);
        
        //IMPRIMIR LOS OBJETOS
        System.out.println(nVal);
        System.out.println(nCopiaVal);
        
        //COPIA REAL DE UN OBJETO
        Numero o = new Numero();
        System.out.println(o);
        
        Numero oCopia = new Numero();
        oCopia.i = o.i;
        System.out.println(oCopia);
        
        o.i++;
        System.out.println("o.i = " + o.i);
        System.out.println("oCopia.i = " + oCopia.i);
        
    }
    
}

class Numero {
    public int i = 15;
}
