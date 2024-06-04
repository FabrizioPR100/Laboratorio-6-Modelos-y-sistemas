/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio6;

/**
 *
 * @author Fabri
 */
public class Diseñador extends Empleado{

    public Diseñador(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    public void disenar(){
        System.out.println(nombre + " esta disenando una interfaz");
    }
    
    public void trabajar() {
        super.trabajar();
        disenar();
    }
  
    public String obtenerRol() {
        return "Gerente";
    }
    
}
