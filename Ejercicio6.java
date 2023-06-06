/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author EsteP
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaNotas = 0;
        int notaMayor = Integer.MIN_VALUE;
        int notaMenor = Integer.MAX_VALUE;
        int cantidadAprobados = 0;
        int cantidadEstudiantes = 0;

        while (true) {
            String notaInput = JOptionPane.showInputDialog("Ingrese la nota del estudiante ");
            int nota = Integer.parseInt(notaInput);

            if (nota < 0) {
                break;
            }

            sumaNotas += nota;
            cantidadEstudiantes++;

            if (nota > notaMayor) {
                notaMayor = nota;
            }

            if (nota < notaMenor) {
                notaMenor = nota;
            }

            if (nota >= 70) {
                cantidadAprobados++;
            }
        }

        if (cantidadEstudiantes > 0) {
            double promedio = (double) sumaNotas / cantidadEstudiantes;

            JOptionPane.showMessageDialog(null, "Promedio de notas: " + promedio
                    + "\nNota mayor: " + notaMayor
                    + "\nNota menor: " + notaMenor
                    + "\nCantidad de estudiantes aprobados: " + cantidadAprobados);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron notas de estudiantes.");
        }
    }
}
    
        
       