/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.gestionasistencia;
import java.util.*;
import java.io.*;

/**
 *
  * @author Fernadno Melillan
  * @author Esteban Rodriguez
 */
public class Alumno extends Persona{
    private Asistencia historial ;

    public Alumno(String name, int rut) {
        super(name,rut);
        historial = new Asistencia();
    }
    public Asistencia getHistorial() {
        return historial;
    }

    public void setHistorial(Asistencia historial) {
        this.historial = historial;
    }
    //Override
    public void mostrarInfo(){
        System.out.println("Nombre: "+getName()+"\n");
        System.out.println("RUT: "+getRut()+"\n");
        historial.infoAsistidos();
    }
    public boolean registrarAsistencia(){//Metodo usado para ingresar por teclado la asistencia
       
       int dia = 99;
       String mes = new String();
        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el mes\n");
            mes = lector.readLine();
            System.out.println("Ingrese el dia\n");
            dia = Integer.parseInt(lector.readLine());
            dia--;
            System.out.println("Ingrese una opcion\n 0 = Inasistencia | 1 = Asistencia \n");
            int asistio=Integer.parseInt(lector.readLine());
            historial.inscribirAsistencia(dia, asistio, mes);
            System.out.println("Se registro la asistencia\n-----------------------\n");
            return true;
        
        } 
        catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println("No se registro correctamente :( \n------------------------\n");
       return false;
    }
    
   public void registrarAsistencia(int dia, int asiste, String mes){//Metodo usado para ingresar datos iniciales
       
       historial.inscribirAsistencia(dia, asiste, mes);
       
   }
   //metodo para modicar asistencia
    public boolean modificarAsistencia(){
        int dia = 99;
           String mes = new String();
            try {
                BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Ingrese Mes a modificar\n");
                mes = lector.readLine();
                System.out.println("Ingrese D??a a modificar\n");
                dia = Integer.parseInt(lector.readLine());
                dia--;
                System.out.println("Ingrese la nueva asistencia de su alumno");
                System.out.println("Ingrese una opcion\n 0 = Inasistencia | 1 = Asistencia \n");
                int asistio=Integer.parseInt(lector.readLine());
                historial.inscribirAsistencia(dia, asistio, mes);
                System.out.println("Se modifico correctamente la asistencia\n------------------------\n");
                return true;

            } 
            catch (IOException ex){
                ex.printStackTrace();
            }
            System.out.println("No se modifico nada :( \n------------------------\n");
           return false;
    }
    
}//fin clase