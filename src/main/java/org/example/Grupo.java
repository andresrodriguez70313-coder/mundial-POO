package org.example;

import java.util.ArrayList;

public class Grupo {

    private String nombre;
    private ArrayList<Seleccion> selecciones;

    // Constructor
    public Grupo(String nombre) {
        this.nombre = nombre;
        this.selecciones = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Seleccion> getSelecciones() {
        return selecciones;
    }

    // Métodos de negocio
    public void agregarSeleccion(Seleccion seleccion) {
        selecciones.add(seleccion);
    }

    public void mostrarSelecciones() {
        System.out.println("Grupo " + nombre);

        for (Seleccion seleccion : selecciones) {
            System.out.println("- " + seleccion.getPais());
        }
    }
}
