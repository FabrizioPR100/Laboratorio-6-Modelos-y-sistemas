/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio6;

/**
 *
 * @author Fabri
 */
class Desarrollador extends Empleado {
    public Desarrollador(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    public void escribirCodigo() {
        System.out.println(nombre + " esta escribiendo código.");
    }

    public void trabajar() {
        super.trabajar();
        escribirCodigo();
    }

    public String obtenerRol() {
        return "Desarrollador";
    }
}
