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
public class Main {
    public static void main(String[] args)throws IOException{
        int op=100;
        System.out.println("");
        Colegio administracion = new Colegio();
        String name1 = "Kylian Mbappe";
        int rut1 = 21103133;
        String name2 = "God Usopp";
        int rut2 = 13131031;
        administracion.agregarAlumno(rut2, name2);
        administracion.agregarAlumno(rut1, name1);
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("Elija una opcion:\n");
            System.out.println("1. Agregar alumno \n");
            System.out.println("2. Registrar asistencia\n");
            System.out.println("3. Mostrar alumnos\n");
            System.out.println("----------------------------------\n");
            op = lector.read();
            
            switch(op){
                case 1:{
                    administracion.agregarAlumno();//implementado en la clase colegio
                    break;
            }
                case 2:{
                    System.out.println("Ingrese el rut del alumno\n");
                    int rut = Integer.parseInt(lector.readLine());
                    administracion.registrarAsistencia(rut);
                    break;
                }
                case 3:{
                    for(Alumno aux:administracion.alumnado.values()){
                        System.out.println("Nombre: "+aux.getName()+"Rut: "+aux.getRut()+"\n");
                    }
                    break;
                }
                    
            }
        }while(op!=0);
    }
}
