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
public class Estudiante extends Persona {
    private String nota;
    
    public Estudiante() {
    }
    
    public Estudiante(int String) {
        this.nota = nota;
    }

    public Estudiante(String nota, String id, String nombre, String apellido, String edad) {
        super(id, nombre, apellido, edad);
        this.nota = nota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
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
        return "Estudiante{" + "Id: " + id + ",  Nombre: " + nombre + ",  Apellido: " + apellido + ",  Edad: " + edad + ",  Nota: " + nota + '}';
    }
 
}
