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
    HashMap<Integer,Alumno> alumnado = new HashMap<>();

    public HashMap<Integer, Alumno> getAlumnado() {
        return alumnado;
    }

    public void setAlumnado(HashMap<Integer, Alumno> alumnado) {
        this.alumnado = alumnado;
    }
    
    public void agregarAlumno(Integer rut, String name )throws IOException{
        Alumno nuevo = new Alumno(name,(int)rut);
        alumnado.put(rut, nuevo);
    }
    public void agregarAlumno() throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre:\n");
        String name = lector.readLine();
        System.out.println("Ingrese el rut:\n");
        int rut = Integer.parseInt(lector.readLine());
        Alumno nuevo = new Alumno(name, rut);
        alumnado.put(rut, nuevo);
    }
    
    public void registrarAsistencia(int rut)throws IOException{
       BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
       Asistencia registrar = alumnado.get(rut).getRegistro();
       System.out.println("Ingrese el mes\n");
       String mes = lector.readLine();
       System.out.println("Ingrese el dia\n");
       int dia = Integer.parseInt(lector.readLine());
       Boolean[] array = new Boolean[31];
        array = registrar.getRegistro().get(mes);
       dia--;
        System.out.println("Ingrese una opcion\n 0 = Inasistencia | 1 = Asistencia \n");
       int op=Integer.parseInt(lector.readLine());
       if(op == 0)array[dia]=false;
       if(op == 1)array[dia]=true;
        System.err.println("Se registro la asistencia\n-----------------------\n");
    }
}
    
