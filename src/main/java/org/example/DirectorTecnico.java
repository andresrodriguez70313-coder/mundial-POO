package org.example;

public class DirectorTecnico extends Persona {

    private int experiencia;
    private int titulosObtenidos;

    // Constructor
    public DirectorTecnico(String nombre, int edad, int experiencia, int titulosObtenidos) {
        super(nombre, edad);
        this.experiencia = experiencia;
        this.titulosObtenidos = titulosObtenidos;
    }

    // Getters y Setters
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getTitulosObtenidos() {
        return titulosObtenidos;
    }

    public void setTitulosObtenidos(int titulosObtenidos) {
        this.titulosObtenidos = titulosObtenidos;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Director Técnico: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Experiencia: " + experiencia + " años");
        System.out.println("Títulos obtenidos: " + titulosObtenidos);
    }
}