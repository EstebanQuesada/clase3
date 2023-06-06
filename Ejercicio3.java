/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author EsteP
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese el número de filas del triángulo");
        int numeroFilas = Integer.parseInt(input);
        String triangulo = "";
        for (int i = 1; i <= numeroFilas; i++) {
            for (int j = 1; j <= i; j++) {
                triangulo += "* ";
            }
            triangulo += "\n";
        }
        JOptionPane.showMessageDialog(null, triangulo);
        // TODO code application logic here
    }
    
}
