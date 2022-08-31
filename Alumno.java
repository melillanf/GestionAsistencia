/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.gestionasistencia;

/**
 *
 * @author Magister 19
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
