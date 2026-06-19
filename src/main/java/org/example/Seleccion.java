package org.example;

import java.util.ArrayList;

public class Seleccion {

    private String pais;
    private String confederacion;
    private DirectorTecnico directorTecnico;
    private ArrayList<Jugador> jugadores;

    private int puntos;
    private int golesFavor;
    private int golesContra;

    // Constructor
    public Seleccion(String pais, String confederacion) {
        this.pais = pais;
        this.confederacion = confederacion;
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
    }

    // Getters y Setters
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getConfederacion() {
        return confederacion;
    }

    public void setConfederacion(String confederacion) {
        this.confederacion = confederacion;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(DirectorTecnico directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    // Métodos de negocio

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void actualizarEstadisticas(int golesFavor, int golesContra) {
        this.golesFavor += golesFavor;
        this.golesContra += golesContra;

        if (golesFavor > golesContra) {
            puntos += 3;
        } else if (golesFavor == golesContra) {
            puntos += 1;
        }
    }

    public void mostrarInformacion() {
        System.out.println("País: " + pais);
        System.out.println("Confederación: " + confederacion);
        System.out.println("Puntos: " + puntos);
        System.out.println("Goles a favor: " + golesFavor);
        System.out.println("Goles en contra: " + golesContra);

        if (directorTecnico != null) {
            System.out.println("Director Técnico: " + directorTecnico.getNombre());
        }

        System.out.println("Cantidad de jugadores: " + jugadores.size());
    }
}