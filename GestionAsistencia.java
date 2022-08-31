/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package proyecto.gestionasistencia;
import java.util.*;
import java.io.*;
/**
 *
 * @author
 */
public class GestionAsistencia {

    public static void main(String[] args)throws IOException{
        int op=100;
        System.out.println("");
        HashMap<Integer,Alumno> alumnado;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("Elija una opcion:\n");
            System.out.println("1. Registrar asistencia");
            System.out.println("2. Registrar retiro\n");
            System.out.println("3. Mostrar asistencias de alumno\n");
            System.out.println("Mostrar retiros de alumno");
            System.out.println("----------------------------------\n");
            op = lector.read();
            
            switch(op){
                case 1:{
                    System.out.println("Ingrese el rut del alumno: \n");
                    int rutAlumno = lector.read();
                    System.out.println("Ingrese mes y dia\n");
                    String mes = lector.readLine();
                    int dia = lector.read();
                    break;
            }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                break;
                }
                    
            }
        }while(op!=0);
    }
    
    
    
}
