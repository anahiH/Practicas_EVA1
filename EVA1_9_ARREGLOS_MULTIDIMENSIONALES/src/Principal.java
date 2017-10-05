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
        //ARREGLOS MULTIDIMENSIONALES ARREGLOS DE ARREGLOS
        //MATRIZ DE 2 X 2 DIMENSIONES [filas][columnas]
        int aiMatriz[][] = new int[2][2];
        
        //llenar con valores aleatorios
        //for para filas
        //for para columnas
        for (int i = 0; i < 2; i++) {
            for (int o = 0; o < 2; o++) {
                aiMatriz[i][o] = (int)(Math.random()*10) + 1; //llenar 1-10
            }
        }
        
        //IMPRIMIR TODOS LOS VALORES
        for(int i = 0; i<2; i++) {
            for(int o = 0; o<2; o++) {
                System.out.print("["+aiMatriz[i][o]+"]");
            }
            System.out.println(""); //nos cambia de linea
        }
        
        //IMPRIMIR USADO FOR EACH
        for(int[] aiMatriz1 : aiMatriz) {
            //usando otro for each
            for(int g : aiMatriz1) {
                System.out.print("["+g+"]");
            }
            System.out.println("");
        }
    }
    
}
