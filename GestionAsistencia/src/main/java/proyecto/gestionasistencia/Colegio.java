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
    
    public void registrarAsistencia()throws IOException{
       
        //Desde aqui se pasa la informacion del alumno, se obtiene el rut por consola
        //y se busca en la coleccion, en caso de encontrarse, lo pasa al metodo agrega
    }

    public HashMap<Integer, Alumno> getAlumnado() {
        return alumnado;
    }

    public void setAlumnado(HashMap<Integer, Alumno> alumnado) {
        this.alumnado = alumnado;
    }
    
    
}
    
