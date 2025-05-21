/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pynky
 */
public class Admin extends Persona {

    private String cargo;
    private String areaEncargada;
    private String CorreoInstitucional;
    private String telefonoContacto;

    public Admin(String cargo, String areaEncargada, String CorreoInstitucional, String telefonoContacto, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoIdentificacion, String numeroIdentificacion, String edad, String sexo, String peso, String cumpleaños) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, tipoIdentificacion, numeroIdentificacion, edad, sexo, peso, cumpleaños);
        this.cargo = cargo;
        this.areaEncargada = areaEncargada;
        this.CorreoInstitucional = CorreoInstitucional;
        this.telefonoContacto = telefonoContacto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAreaEncargada() {
        return areaEncargada;
    }

    public void setAreaEncargada(String areaEncargada) {
        this.areaEncargada = areaEncargada;
    }

    public String getCorreoInstitucional() {
        return CorreoInstitucional;
    }

    public void setCorreoInstitucional(String CorreoInstitucional) {
        this.CorreoInstitucional = CorreoInstitucional;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

}
