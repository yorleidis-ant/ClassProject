/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Profesor;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ProfesorController {

    private static List<Profesor> listaProfesores = new ArrayList<>();

    public static boolean registrarProfesor(
            String primerNombre,
            String segundoNombre,
            String primerApellido,
            String segundoApellido,
            String fechaNacimiento,
            String lugarNacimiento,
            String correoElectronico,
            String telefono
    ) {
        // Validaciones básicas
        if (primerNombre.isEmpty() || primerApellido.isEmpty()) {
            mostrarError("El primer nombre y el primer apellido son obligatorios.");
            return false;
        }

        if (!correoElectronico.contains("@")) {
            mostrarError("Correo electrónico no válido.");
            return false;
        }

        if (!telefono.matches("\\d{10}")) {
            mostrarError("El teléfono debe tener entre 10 dígitos.");
            return false;
        }

        Profesor profesor = new Profesor(
                primerNombre, segundoNombre, primerApellido, segundoApellido,
                fechaNacimiento, lugarNacimiento, correoElectronico, telefono
        );

        listaProfesores.add(profesor);
        JOptionPane.showMessageDialog(null, "Profesor registrado con éxito.");
        return true;
    }

    private static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static List<Profesor> getListaProfesores() {
        return listaProfesores;
    }
}
   

