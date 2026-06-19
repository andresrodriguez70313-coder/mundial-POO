package org.example;

public class Jugador extends Persona {

    private int dorsal;
    private String posicion;

    // Constructor
    public Jugador(String nombre, int edad, int dorsal, String posicion) {
        super(nombre, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    // Getters y Setters
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Jugador: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Posición: " + posicion);
    }
}
