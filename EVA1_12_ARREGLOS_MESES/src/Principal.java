
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
        String asMes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        //DIAS
        int aiDia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        //SOLICITAR EL MES AL USUARIO
        int mes;
        Scanner s = new Scanner(System.in);
        System.out.println("NUMERO DE MES (1-12):");
        
        mes = s.nextInt();
        System.out.println("El mes es " + asMes[mes-1] + " y tiene " + aiDia[mes-1] + " días.");
    }
    
}
