package org.example;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JTextArea areaTexto;

    public VentanaPrincipal() {

        setTitle("Sistema de Gestión de Torneo");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new BorderLayout());

        JPanel panelBotones = new JPanel();

        JButton btnJugador = new JButton("Crear Jugador");
        JButton btnSeleccion = new JButton("Crear Selección");
        JButton btnVerJugadores = new JButton("Ver Jugadores");
        JButton btnVerSelecciones = new JButton("Ver Selecciones");
        JButton btnSalir = new JButton("Salir");
        JButton btnExportar = new JButton("Exportar CSV");

        panelBotones.add(btnJugador);
        panelBotones.add(btnSeleccion);
        panelBotones.add(btnVerJugadores);
        panelBotones.add(btnVerSelecciones);
        panelBotones.add(btnExportar);
        panelBotones.add(btnSalir);

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);

        JScrollPane scroll = new JScrollPane(areaTexto);

        panelPrincipal.add(panelBotones, BorderLayout.NORTH);
        panelPrincipal.add(scroll, BorderLayout.CENTER);

        add(panelPrincipal);
        btnExportar.addActionListener(e -> {

            try {

                Torneo torneo = new Torneo("Mundial 2026");

                Grupo grupo = new Grupo("A");

                for (Seleccion seleccion : DatosTorneo.selecciones) {
                    grupo.agregarSeleccion(seleccion);
                }

                torneo.agregarGrupo(grupo);

                Archivocsv archivo = new Archivocsv();

                archivo.exportarSelecciones(
                        torneo,
                        "torneo.csv"
                );

                JOptionPane.showMessageDialog(
                        this,
                        "Archivo torneo.csv generado correctamente."
                );

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Error al exportar: " + ex.getMessage()
                );
            }
        });
        btnJugador.addActionListener(e -> {
            FormJugador formulario = new FormJugador();
            formulario.setVisible(true);

        });

        btnSeleccion.addActionListener(e -> {
            FormSeleccion formulario = new FormSeleccion();
            formulario.setVisible(true);

        });
        btnVerJugadores.addActionListener(e -> {

            areaTexto.setText("");

            for (Jugador jugador : DatosTorneo.jugadores) {

                areaTexto.append(
                        jugador.getNombre()
                                + "\n"
                );
            }
        });

        btnVerSelecciones.addActionListener(e -> {

            areaTexto.setText("");

            for (Seleccion seleccion : DatosTorneo.selecciones) {

                areaTexto.append(
                        seleccion.getPais()
                                + "\n"
                );
            }
        });
        btnSalir.addActionListener(e -> System.exit(0));
    }
}