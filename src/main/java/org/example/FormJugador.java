package org.example;

import javax.swing.*;
import java.awt.*;

public class FormJugador extends JFrame {

    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtDorsal;
    private JTextField txtPosicion;

    public FormJugador() {

        setTitle("Registrar Jugador");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        panel.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        panel.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panel.add(txtEdad);

        panel.add(new JLabel("Dorsal:"));
        txtDorsal = new JTextField();
        panel.add(txtDorsal);

        panel.add(new JLabel("Posición:"));
        txtPosicion = new JTextField();
        panel.add(txtPosicion);

        JButton btnGuardar = new JButton("Guardar");
        panel.add(btnGuardar);

        add(panel);

        btnGuardar.addActionListener(e -> guardarJugador());
    }

    private void guardarJugador() {

        try {

            String nombre = txtNombre.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            int dorsal = Integer.parseInt(txtDorsal.getText());
            String posicion = txtPosicion.getText();

            Jugador jugador = new Jugador(
                    nombre,
                    edad,
                    dorsal,
                    posicion

            );
            DatosTorneo.jugadores.add(jugador);            JOptionPane.showMessageDialog(
                    this,
                    "Jugador registrado correctamente:\n" + nombre
            );

            dispose();

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Edad y dorsal deben ser números."
            );
        }
    }
}