/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.gestionasistencia;
import java.io.*;
import java.util.*;
/**
 *
  * @author Fernadno Melillan
  * @author Esteban Rodriguez
 */
public class Asistencia {
    private HashMap <String,Boolean[]> registro;//K: mes - V: array mes
    private HashMap <String, String[]> retiros;
        
    public Asistencia(){
        Boolean[] array = new Boolean[31];
        String[] arrayString = new String[31];
        registro = new HashMap<>();
        String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        for(int i=0;i<31;i++){
            registro.put(meses[i],array);
            retiros.put(meses[i], arrayString);
        }
    }
    
    //funcion para ingresar asistencia al hashmap
    public void inscribirAsistencia(int dia, int asistio, String mes){
        
        Boolean[] array = new Boolean[31];//crea un arreglo auxiliar booleano
        array = registro.get(mes);//se le asigna el arreglo correspondiente al mes solicitado
        if(asistio == 0)array[dia]=false;
        if(asistio == 1)array[dia]=true;
        registro.replace(mes, array);//actualiza el array en el registro   
    }
   
    public void infoAsistidos(){
        int asistido = 0;
        int inasistido = 0;
        for(Boolean[] dias: registro.values()){
            for(int i=0; i<31;i++){
                if(dias[i])asistido++;
                if(!dias[i])inasistido++;
            }
        }
        System.out.println("Dias asistidos: "+asistido+"\n");
        System.out.println("Dias inasistidos: "+inasistido+"\n");
    }
    //funcion asistencia de dia y mes determinado por el usuario
    String auxMes = new String();
    int auxDia = 0;
    
    public void asistenciaMesYDia()throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Selecciones su mes");
        auxMes = lector.readLine();
        System.out.println("Selecciones si día");
        auxDia = Integer.parseInt(lector.readLine());
        System.out.println("-----------------------------------");
        System.out.println("Asistencia de Alumnos");
        System.out.println("Día: "+auxDia+" y Mes: "+auxMes);
        System.out.println("------------------------------------");
        System.out.println("aqui se imprimira el hashmap de los alumnos de ese dia");
    }
}//Fin clase
