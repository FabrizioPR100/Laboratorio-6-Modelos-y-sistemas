/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio6;

/**
 *
 * @author Fabri
 */
abstract class Empleado implements IEmpleado {
    protected int id;
    protected String nombre;
    protected double salario;

    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println(nombre + " esta trabajando.");
    }
    public abstract String obtenerRol();
}
