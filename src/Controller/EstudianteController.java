/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import Model.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class EstudianteController {

    private static List<Estudiante> listaEstudiantes = new ArrayList<>();

    public static boolean registrarEstudiante(
            String primerNombre,
            String segundoNombre,
            String primerApellido,
            String segundoApellido,
            String fechaNacimiento,
            String lugarNacimiento,
            String acudiente,
            String telefonoAcudiente
    ) {
        // Validaciones simples
        if (primerNombre.isEmpty() || primerApellido.isEmpty()) {
            mostrarError("El primer nombre y el primer apellido son obligatorios.");
            return false;
        }

        if (!telefonoAcudiente.matches("\\d{10}")) {
            mostrarError("El teléfono del acudiente debe tener 10 dígitos.");
            return false;
        }

        Estudiante estudiante = new Estudiante(
                primerNombre, segundoNombre, primerApellido, segundoApellido,
                fechaNacimiento, lugarNacimiento, acudiente, telefonoAcudiente
        );

        listaEstudiantes.add(estudiante);
        JOptionPane.showMessageDialog(null, "Estudiante registrado con éxito.");
        return true;
    }

    private static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
}
