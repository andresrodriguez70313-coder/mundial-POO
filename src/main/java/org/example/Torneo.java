package org.example;

import java.util.ArrayList;

public class Torneo {

    private String nombre;
    private ArrayList<Grupo> grupos;
    private ArrayList<Partido> partidos;

    // Constructor
    public Torneo(String nombre) {
        this.nombre = nombre;
        this.grupos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    // Agregar grupo
    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }

    // Agregar partido
    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    // Mostrar grupos
    public void mostrarGrupos() {

        System.out.println("=== GRUPOS DEL TORNEO ===");

        for (Grupo grupo : grupos) {
            grupo.mostrarSelecciones();
            System.out.println();
        }
    }

    // Mostrar partidos
    public void mostrarPartidos() {

        System.out.println("=== PARTIDOS DEL TORNEO ===");

        for (Partido partido : partidos) {
            partido.mostrarPartido();
            System.out.println();
        }
    }

    // Mostrar información general
    public void mostrarInformacion() {

        System.out.println("Torneo: " + nombre);
        System.out.println("Cantidad de grupos: " + grupos.size());
        System.out.println("Cantidad de partidos: " + partidos.size());
    }
}
