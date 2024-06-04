/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio6;

/**
 *
 * @author Fabri
 */
class Gerente extends Empleado implements IProyectos {
    public Gerente(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    public void gestionarProyecto() {
        System.out.println(nombre + " esta gestionando un proyecto.");
    }

    public void trabajar() {
        super.trabajar();
        gestionarProyecto();
    }

    public String obtenerRol() {
        return "Gerente";
    }
}

