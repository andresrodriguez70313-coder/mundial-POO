package org.example;

import javax.swing.*;
import java.awt.*;

public class FormSeleccion extends JFrame {

    private JTextField txtPais;
    private JTextField txtConfederacion;

    public FormSeleccion() {

        setTitle("Registrar Selección");
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        panel.add(new JLabel("País:"));
        txtPais = new JTextField();
        panel.add(txtPais);

        panel.add(new JLabel("Confederación:"));
        txtConfederacion = new JTextField();
        panel.add(txtConfederacion);

        JButton btnGuardar = new JButton("Guardar");
        panel.add(btnGuardar);

        add(panel);

        btnGuardar.addActionListener(e -> guardarSeleccion());
    }

    private void guardarSeleccion() {

        String pais = txtPais.getText();
        String confederacion = txtConfederacion.getText();

        Seleccion seleccion = new Seleccion(
                pais,
                confederacion
        );
        DatosTorneo.selecciones.add(seleccion);
        JOptionPane.showMessageDialog(
                this,
                "Selección registrada correctamente:\n" + pais
        );

        dispose();
    }
}
