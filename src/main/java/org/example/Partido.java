package org.example;

public class Partido {

    private Seleccion local;
    private Seleccion visitante;

    private int golesLocal;
    private int golesVisitante;

    private boolean jugado;

    // Constructor
    public Partido(Seleccion local, Seleccion visitante) {
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = 0;
        this.golesVisitante = 0;
        this.jugado = false;
    }

    // Getters
    public Seleccion getLocal() {
        return local;
    }

    public Seleccion getVisitante() {
        return visitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    // Registrar resultado
    public void registrarResultado(int golesLocal, int golesVisitante) {

        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.jugado = true;

        local.actualizarEstadisticas(golesLocal, golesVisitante);
        visitante.actualizarEstadisticas(golesVisitante, golesLocal);
    }

    // Mostrar información
    public void mostrarPartido() {

        System.out.println(local.getPais() + " vs " + visitante.getPais());

        if (jugado) {
            System.out.println("Resultado: "
                    + golesLocal + " - " + golesVisitante);
        } else {
            System.out.println("Partido pendiente");
        }
    }
}