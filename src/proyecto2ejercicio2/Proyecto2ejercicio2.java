/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2ejercicio2;

import entidades.Estudiante;
import entidades.Persona;
import entidades.Profesor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author siviany
 */
public class Proyecto2ejercicio2 {

    static ArrayList<Persona> listaPersonas = new ArrayList();
    static String nombre = "";
    static String apellido = "";
    static String edad = "";
    static String id = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();

        String nota = "";
        String horario = "";
        String opcionUsuario = "";
        String concatena = "";
        boolean salir = true;
        do {
            opcionUsuario = JOptionPane.showInputDialog(" Ingrese una de las siguientes opciones:\n"
                    + "1 - Agregar Estudiante\n"
                    + "2 - Agregar Profesor\n"
                    + "3 - Mostrar lista Profesores y Estudiates\n"
                    + "4 - Eliminar elementos\n"
                    + "5 - Salir");
            switch (opcionUsuario) {
                case "1":
                    datosPersona();
                    nota = JOptionPane.showInputDialog("Ingrese la nota");
                    Persona estudiante = new Estudiante(nota, id, nombre, apellido, edad);
                    listaPersonas.add(estudiante);
                    break;
                case "2":
                    datosPersona();
                    horario = JOptionPane.showInputDialog("Ingrese el horario");
                    Persona profesor = new Profesor(horario, id, nombre, apellido, edad);
                    listaPersonas.add(profesor);
                    break;
                case "3":
                    concatena = "";
                    for (int i = 0; i < listaPersonas.size(); i++) {
                        if (listaPersonas.get(i) instanceof Estudiante) {
                            Estudiante estudiante2 = (Estudiante) listaPersonas.get(i);
                            concatena = concatena + estudiante2.toString() + "\n";
                        }
                        if (listaPersonas.get(i) instanceof Profesor) {
                            Profesor profesor2 = (Profesor) listaPersonas.get(i);
                            concatena = concatena + profesor2.toString() + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, concatena);
                    break;
                case "4":
                        id = JOptionPane.showInputDialog("Ingrese la id");
                        for (int i = 0; i < listaPersonas.size(); i++) {
                            if (listaPersonas.get(i).getId().equals(id)) {
                                listaPersonas.remove(i);
                                JOptionPane.showMessageDialog(null, "La persona fue eliminada");
                            }else{
                                JOptionPane.showMessageDialog(null, "La id no existe");
                            }
                        }
                    break;
                case "5":
                    salir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingreso una opcion no permitida");
            }
        } while (salir);
    }

    public static void datosPersona() {
        boolean continuar = false;
        do {
            continuar = false;
            id = JOptionPane.showInputDialog("Ingrese la id");
            for (int i = 0; i < listaPersonas.size(); i++) {
                if (listaPersonas.get(i).getId() == id) {
                    JOptionPane.showMessageDialog(null, "La id ya existe");
                    continuar = true;
                }
            }
        } while (continuar);
        nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido");
        edad = JOptionPane.showInputDialog("Ingrese la edad");
    }
}
