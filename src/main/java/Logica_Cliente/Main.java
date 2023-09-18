/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Atributos
        
        String Nombre="";
        int Cedula=0;
        int Año_nacimiento=0;
        int Año_actual=2023;
        int Resultado1=0;
       
        //creacion de objetos
        Persona objpersona= new Persona();
        Scanner scan =new Scanner (System.in);
        
        System.out.println("Digite su nombre");
        Nombre = scan.nextLine();
        objpersona.setNombre(Nombre);
        
        System.out.println("Digite su cedula");
        Cedula = scan.nextInt();
        objpersona.setCedula(Cedula);
        
        System.out.println("Digite su año de nacimiento");
        Año_nacimiento = scan.nextInt();
        objpersona.setAño_nacimiento(Año_nacimiento);
        
        
        //operacion
        
        int resultado= Año_actual - objpersona.getAño_nacimiento();
        
        
        
        //creacion de objetos con constructor parametrizado
        Persona objpersona1 = new Persona(Nombre, Cedula, Año_nacimiento);
        
        int resultado1 = Año_actual - objpersona1.getAño_nacimiento();
        
        

        //impresion en pantalla
        
        System.out.println("su nombre es:"+"\t"+objpersona.getNombre());
        System.out.println("su numero de cedula es:"+"\t"+objpersona.getCedula());
        System.out.println("su edad es de:"+"\t"+resultado);
       
        
        System.out.println("su nombre es:"+"\t"+objpersona1.getNombre());
        System.out.println("su numero de cedula es:"+"\t"+objpersona1.getCedula());
        System.out.println("su edad es de:"+"\t"+resultado1);
        
    }
    
}
