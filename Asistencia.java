/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.gestionasistencia;
import java.util.*;
/**
 *
 * @author Magister 19
 */
public class Asistencia {
    HashMap <String,Boolean[]> registro;//K: mes - V: array mes
    HashMap <String, String[]> retiros;
        
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

    public HashMap<String, Boolean[]> getRetiros() {
        return retiros;
    }

    public void setRetiros(HashMap<String, Boolean[]> retiros) {
        this.retiros = retiros;
    }
    
    
    
    
}
