
import java.util.Scanner;

/*PROYECTO INICIAL PARA CONOCER E IDENTIFICAR LOS TIPOS DE DATOS PRIMITIVOS
EN JAVA*/
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
        String sNom;
        int iEdad;
        double dSalario;
        
        Scanner sScanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        sNom = sScanner.nextLine();
        
        System.out.println("Introduce tu edad");
        iEdad = sScanner.nextInt();
        
        System.out.println("Introduce tu salario");
        dSalario = sScanner.nextDouble();
        
        hacerAlgo(sNom, iEdad, dSalario);
    }
    
    /**
     * Ejemplo para comentarios usando javadoc
     * @param sNombre ejemplo usando string
     * @param iEdad ejemplo usando enteros
     * @param dSalario ejemplo usando doubles
     */
    public static void hacerAlgo(String sNom, int iEdad, double dSalario) {
        System.out.println(sNom + " " + iEdad + " " + dSalario);
    }
}
