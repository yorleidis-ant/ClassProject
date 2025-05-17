/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pynky
 */
public class Profesor extends Persona {
     
    private String profesion;
    private String materia;
    private String HorarioClases;
    private String correoInstitucional;

    public Profesor(String profesion, String materia, String HorarioClases, String correoInstitucional, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoIdentificacion, String numeroIdentificacion, String edad, String sexo, String peso, String cumpleaños) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, tipoIdentificacion, numeroIdentificacion, edad, sexo, peso, cumpleaños);
        this.profesion = profesion;
        this.materia = materia;
        this.HorarioClases = HorarioClases;
        this.correoInstitucional = correoInstitucional;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getHorarioClases() {
        return HorarioClases;
    }

    public void setHorarioClases(String HorarioClases) {
        this.HorarioClases = HorarioClases;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    
}

