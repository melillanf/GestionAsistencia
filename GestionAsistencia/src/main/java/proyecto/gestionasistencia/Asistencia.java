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

    public HashMap<String, Boolean[]> getRegistro() {
        return registro;
    }

    public void setRegistro(HashMap<String, Boolean[]> registro) {
        this.registro = registro;
    }

    public HashMap<String, String[]> getRetiros() {
        return retiros;
    }

    public void setRetiros(HashMap<String, String[]> retiros) {
        this.retiros = retiros;
    }
   
    
    
}//Fin clase
