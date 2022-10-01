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
 * @author melil
 */
public class Alumno {
    private String name;
    private int rut;
    private Asistencia historial = new Asistencia();

    public Alumno(String name, int rut) {
        this.name = name;
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public Asistencia getHistorial() {
        return historial;
    }

    public void setHistorial(Asistencia historial) {
        this.historial = historial;
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
                System.out.println("Mes a modificar\n");
                System.out.println("Ingrese el mes\n");
                mes = lector.readLine();
                System.out.println("Dia a modificar\n");
                System.out.println("Ingrese el dia\n");
                dia = Integer.parseInt(lector.readLine());
                dia--;
                System.out.println("Ingrese la nueva asistencia de su alumno");
                System.out.println("Ingrese una opcion\n 0 = Inasistencia | 1 = Asistencia \n");
                int asistio=Integer.parseInt(lector.readLine());
                historial.inscribirAsistencia(dia, asistio, mes);
                System.out.println("Se modifico correctamente la asistencia\n-----------------------\n");
                return true;

            } 
            catch (IOException ex){
                ex.printStackTrace();
            }
           return false;
    }
    
}//fin clase