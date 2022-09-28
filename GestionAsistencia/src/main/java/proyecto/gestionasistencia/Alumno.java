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
    
    public boolean registrarAsistencia(){
       
      
       int dia = 99;
       String mes = new String();
        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el mes\n");
            mes = lector.readLine();
            System.out.println("Ingrese el dia\n");
            dia = Integer.parseInt(lector.readLine());
            Boolean[] array = new Boolean[31];//crea un arreglo auxiliar booleano
            array = historial.getRegistro().get(mes);//se le asigna el arreglo correspondiente al mes solicitado
            dia--;
            System.out.println("Ingrese una opcion\n 0 = Inasistencia | 1 = Asistencia \n");
            int op=Integer.parseInt(lector.readLine());
            if(op == 0)array[dia]=false;
            if(op == 1)array[dia]=true;
            historial.getRegistro().replace(mes, array);//version actualizada del array de asistencias reemplaza la antigua
            System.err.println("Se registro la asistencia\n-----------------------\n");
            return true;
        } 
        catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
       
    }
    
   public void registrarAsistencia(int dia, String mes, boolean asiste){
       
       Boolean[] array = new Boolean[31];
       array = historial.getRegistro().get(mes);
       if(!asiste)array[dia]=false;
       if(asiste)array[dia]=true;
       historial.getRegistro().replace(mes, array);//version actualizada del array de asistencias reemplaza la antigua
       
   }
    
}//fin clase