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
        Alumno aaDatosAlumnos[];//El identificador es nulo
        aaDatosAlumnos = new Alumno[10];//CREAMOS UN ARREGLO DE 10 ALUMNOS
        
        for(int i = 0; i < aaDatosAlumnos.length; i++) {
            aaDatosAlumnos[i] = new Alumno("Anahi", "16550467", 0);
        }
        
        //FOR EACH
        for(Alumno aaDatosAlumnos1 : aaDatosAlumnos) {
            System.out.println("Nombre: " + aaDatosAlumnos1.getsNom());
            System.out.println("Matricula: " + aaDatosAlumnos1.getsMatri());
            System.out.println("Carrera: " + aaDatosAlumnos1.getiCar());
        }
        
        //CREAR COPIAS
        Alumno aaCopiaAlumnos[];
        aaCopiaAlumnos = new Alumno[10];
        
        for (int i = 0; i < aaDatosAlumnos.length; i++) {
            aaCopiaAlumnos[i] = new Alumno(aaDatosAlumnos[i].getsNom(), aaDatosAlumnos[i].getsMatri(), aaDatosAlumnos[i].getiCar());
        }
        
        //IMPRIMIR VALORES
        for(Alumno aaCopiaAlumnos1 : aaCopiaAlumnos) {
            System.out.println("Nombre: " + aaCopiaAlumnos1.getsNom());
            System.out.println("Matricula: " + aaCopiaAlumnos1.getsMatri());
            System.out.println("Carrera: " + aaCopiaAlumnos1.getiCar());
        }
        
        System.out.println(aaCopiaAlumnos[1]);
        System.out.println(aaDatosAlumnos[1]);
    }
    
}

//0 ES SISTEMAS
class Alumno {
    private String sNom;
    private String sMatri;
    private int iCar;
    
    public Alumno(String sNombre, String sMatricula, int iCarrera) {
        sNom = sNombre;
        sMatri = sMatricula;
        iCar = iCarrera;
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsMatri() {
        return sMatri;
    }

    public void setsMatri(String sMatri) {
        this.sMatri = sMatri;
    }

    public int getiCar() {
        return iCar;
    }

    public void setiCar(int iCar) {
        this.iCar = iCar;
    }
    
}
