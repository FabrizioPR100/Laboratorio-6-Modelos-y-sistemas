/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio6;

/**
 *
 * @author Fabri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado diseñador = new Diseñador(1, "Ana", 50000);
        diseñador.trabajar();
        
        Empleado gerente = new Gerente(3,"Pedro",100000);
        gerente.trabajar();
    }
    
}
