/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import View.vAdmin;
import View.vEstudiante;
import javax.swing.JOptionPane;
import View.vLogin;
import View.vProfesor;

public class LoginController {

    private vLogin vista;

    public LoginController(vLogin vista) {
        this.vista = vista;
    }

    public boolean correoValidoParaRol(String correo, String rol) {
    if (rol.equals("Estudiante")) {
        return correo.endsWith("@estudiante.educol.edu.co");
    } else if (rol.equals("Profesor")) {
        return correo.endsWith("@profesor.educol.edu.co");
    } else if (rol.equals("Administrador")) {
        return correo.endsWith("@admin.educol.edu.co");
    }
    return false;
}


    public void procesarLogin(String correo, String contrasena, String rolSeleccionado) {
    if (rolSeleccionado.isEmpty()) {
        JOptionPane.showMessageDialog(vista, "Selecciona un rol antes de ingresar.");
        return;
    }

    if (correo.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(vista, "Completa todos los campos.");
        return;
    }

    
    if (!correo.contains("@")) {
        JOptionPane.showMessageDialog(vista, "El correo debe contener '@'.");
        return;
    }

    
    if (!contrasena.matches("\\d+")) {
        JOptionPane.showMessageDialog(vista, "La contraseña solo debe contener números.");
        return;
    }

    if (!correoValidoParaRol(correo, rolSeleccionado)) {
        JOptionPane.showMessageDialog(vista, "El correo no coincide con el rol seleccionado.");
        return;
    }

    if (correo.equals("estudiante@estudiante.educol.edu.co") && contrasena.equals("122") && rolSeleccionado.equals("Estudiante")) {
        JOptionPane.showMessageDialog(vista, "Bienvenido Estudiante");
        new vEstudiante().setVisible(true);
        vista.dispose();
    } else if (correo.equals("profesor@profesor.educol.edu.co") && contrasena.equals("124") && rolSeleccionado.equals("Profesor")) {
        JOptionPane.showMessageDialog(vista, "Bienvenido Profesor");
        new vProfesor().setVisible(true);
        vista.dispose();
    } else if (correo.equals("admin@admin.educol.edu.co") && contrasena.equals("126") && rolSeleccionado.equals("Administrador")) {
        JOptionPane.showMessageDialog(vista, "Bienvenido Administrador");
        new vAdmin().setVisible(true);
        vista.dispose();
    } else {
        JOptionPane.showMessageDialog(vista, "Credenciales incorrectas.");
    }
}



}


