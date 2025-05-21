/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Estudiante extends Persona {

    private String lugarNacimiento;
    private String acudiente;
    private String telefonoAcudiente;

    public Estudiante(
            String primerNombre,
            String segundoNombre,
            String primerApellido,
            String segundoApellido,
            String fechaNacimiento,
            String lugarNacimiento,
            String acudiente,
            String telefonoAcudiente
    ) {
        // Llenamos los campos de Persona con campos vacíos donde no usamos
        super(primerNombre, segundoNombre, primerApellido, segundoApellido,
                "", "", "", "", "", fechaNacimiento);

        this.lugarNacimiento = lugarNacimiento;
        this.acudiente = acudiente;
        this.telefonoAcudiente = telefonoAcudiente;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(String acudiente) {
        this.acudiente = acudiente;
    }

    public String getTelefonoAcudiente() {
        return telefonoAcudiente;
    }

    public void setTelefonoAcudiente(String telefonoAcudiente) {
        this.telefonoAcudiente = telefonoAcudiente;
    }

}
