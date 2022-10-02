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
public class Colegio {
    private HashMap<Integer,Alumno> alumnado = new HashMap<>();
    
    public void agregarAlumno(Integer rut, String name )throws IOException{
        Alumno nuevo = new Alumno(name,(int)rut);
        alumnado.put(rut, nuevo);
    }
    public void agregarAlumno(){
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); 
        int rut = 0;
        String name = new String();

        try{
            
            System.out.println("Ingrese el nombre:\n");
            name = lector.readLine();
            System.out.println("Ingrese el rut:\n");
            rut = Integer.parseInt(lector.readLine());
        }
        catch(IOException ewe){
            ewe.printStackTrace();
        }
        
        Alumno nuevo = new Alumno(name, rut);
        alumnado.put(rut, nuevo);
    }
    
    public void registrarAsistencia(int rut){
       
        Alumno aux = alumnado.get(rut);
        aux.registrarAsistencia();
    }

    public HashMap<Integer, Alumno> getAlumnado() {
        return alumnado;
    }

    public void setAlumnado(HashMap<Integer, Alumno> alumnado) {
        this.alumnado = alumnado;
    }
    
    
    //funcion para eliminar alumno
    public void eliminarAlumno(Integer rut, String name){
        Alumno eliminado = new Alumno(name,(int)rut);
        alumnado.remove(rut, eliminado);
    }
    
    public void eliminarAlumno(){
         BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); 
        int rut = 0;
        try{
            System.out.println("Ingrese el rut del alumno a eliminar:\n");
            rut = Integer.parseInt(lector.readLine());
        }
        catch(IOException ewe){
            ewe.printStackTrace();
        }
       
        alumnado.remove(rut);
        System.out.println("Se elimino el alumno correctamente\n------------------------\n");
    }
    
    //funcion para modificar asistencia

    public void modificarAsistencia(int rut){
    Alumno aux = alumnado.get(rut);
        aux.modificarAsistencia();
    }
}   
