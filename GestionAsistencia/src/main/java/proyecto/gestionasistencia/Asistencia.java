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
 * @author melil
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
}//Fin clase
