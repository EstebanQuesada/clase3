/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author EsteP
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes");
        int cantidadEstudiantes = Integer.parseInt(input);
        int sumaNotas = 0;
        int notaMayor = Integer.MIN_VALUE;
        int notaMenor = Integer.MAX_VALUE;
        int cantidadAprobados = 0;
        for (int i = 1; i <= cantidadEstudiantes; i++) {
            String notaInput = JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i);
            int nota = Integer.parseInt(notaInput);
            sumaNotas += nota;
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
        double promedio = (double) sumaNotas / cantidadEstudiantes;
        JOptionPane.showMessageDialog(null, "Promedio de notas: " + promedio
                + "\nNota mayor: " + notaMayor
                + "\nNota menor: " + notaMenor
                + "\nCantidad de estudiantes aprobados: " + cantidadAprobados);
        // TODO code application logic here
    }
    
}
