/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Profesor extends Persona {

    private String lugarNacimiento;
    private String correoElectronico;
    private String telefono;

    public Profesor(
            String primerNombre,
            String segundoNombre,
            String primerApellido,
            String segundoApellido,
            String fechaNacimiento,
            String lugarNacimiento,
            String correoElectronico,
            String telefono
    ) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido,
                "", "", "", "", "", fechaNacimiento);

        this.lugarNacimiento = lugarNacimiento;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    // Getters y setters si los necesitas
    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
