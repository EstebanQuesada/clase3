/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author EsteP
 */


public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lectura = JOptionPane.showInputDialog("Ingrese un número");
        double numero = Double.parseDouble(lectura);
        
        for (int i = 1; i <= 10; i++) {
            double resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        // TODO code application logic here
    }
    
}
