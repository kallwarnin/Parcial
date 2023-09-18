/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ADRIANA
 */
public class Persona {
    public String Nombre;
    public int Cedula;
    public int Año_nacimiento;
    
    //constructor no parametrizado

    public Persona() {
    }
    
    
    //constructor parametrizado

    public Persona(String Nombre, int Cedula, int Año_nacimiento) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Año_nacimiento = Año_nacimiento;
    }
    
    
    //setters

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setAño_nacimiento(int Año_nacimiento) {
        this.Año_nacimiento = Año_nacimiento;
    }
    
    //getters

    public String getNombre() {
        return Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public int getAño_nacimiento() {
        return Año_nacimiento;
    }
    
}
