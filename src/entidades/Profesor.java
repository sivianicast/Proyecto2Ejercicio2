/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author siviany
 */
public class Profesor extends Persona {
    private String horario;

    public Profesor() {
    }

    public Profesor(String horario) {
        this.horario = horario;
    }

    public Profesor(String horario, String id, String nombre, String apellido, String edad) {
        super(id, nombre, apellido, edad);
        this.horario = horario;
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getEdad() {
        return edad;
    }

    @Override
    public void setEdad(String edad) {
        this.edad = edad;
    }
     @Override
    public String toString() {
        return "Profesor{" + "Id: " + id + ",  Nombre: " + nombre + ",  Apellido: " + apellido + ",  Edad: " + edad + ",  Horario: " + horario + '}';
    }
}
