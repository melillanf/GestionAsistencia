/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.gestionasistencia;

/**
 *
 * @author melil
 */
public class Alumno {
    private String name;
    private int rut;
    private Asistencia registro = new Asistencia();
    
    public Alumno(String name, int rut) {
        this.name = name;
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public Asistencia getRegistro() {
        return registro;
    }

    public void setRegistro(Asistencia registro) {
        this.registro = registro;
    }
    
    
}