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
public class Main {
    public static void main(String[] args){
        int op=100;
        System.out.println("");
        Colegio administracion = new Colegio();
        String name1 = "Kylian Mbappe";
        int rut1 = 21103133;
        String name2 = "God Usopp";
        int rut2 = 13131031;
        
        try{
            administracion.agregarAlumno(rut2, name2);
            administracion.agregarAlumno(rut1, name1);
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            do{
                System.out.println("Elija una opcion:\n");
                System.out.println("------------------------------------\n");
                System.out.println("1. Agregar alumno \n");
                System.out.println("2. Registrar asistencia \n");
                System.out.println("3. Mostrar alumnos \n");
                System.out.println("4. eliminar alumno \n");
                System.out.println("5. Modificar asistencia \n");
                System.out.println("6. Revisar asistencia por dia y mes");
                System.out.println("------------------------------------\n");
                op = lector.read();
            
                switch(op) {
                    //agregar alumno
                    case 1:{
                        System.out.println("--AGREGAR ALUMNO NUEVO--\n");
                        administracion.agregarAlumno();//implementado en la clase colegio
                        break;
                    }
                    //registrar Asistencia
                    case 2:{
                        System.out.println("--REGISTRO DE ASISTENCIA--\n");
                        System.out.println("Ingrese el rut del alumno\n");
                        int rut = Integer.parseInt(lector.readLine());
                        administracion.registrarAsistencia(rut);
                        break;
                    }
                    //mostrar alumnos
                    case 3:{
                        System.out.println("--TODOS LOS ALUMNOS--");
                        HashMap auxMap = administracion.getAlumnado();
                        for(Object aux: auxMap.values()){
                            Alumno actual = (Alumno) aux;
                            System.out.println("Nombre: "+actual.getName()+"Rut: "+actual.getRut()+"\n");
                        }
                        break;
                    }
                    //elimina alumno
                    case 4:{
                        System.out.println("--ELIMINACION DE ALUMNO--\n");
                            administracion.eliminarAlumno();//implementado en la clase colegio
                            break;
                    }
                    //modifica asistencia de un alumno
                    case 5:{
                        System.out.println("--MODIFICACION DE ASISTENCIA--\n");
                        System.out.println("Ingrese el RUT del alumno\n");
                        int rut = Integer.parseInt(lector.readLine());
                        administracion.modificarAsistencia(rut);
                        break;                                           
                    }
                    //ver asistencia por dia y mes determinado
                    case 6:{
                        System.out.println("--Revisar asistencia");
                        break;
                    }
                }     
        }while(op!=0);
        }
        catch(IOException ewe){
            ewe.printStackTrace();
        }
    }
}
