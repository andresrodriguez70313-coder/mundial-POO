package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Archivocsv implements Exportable {

    @Override
    public void exportarArchivo(String nombreArchivo) {

        try {

            FileWriter writer = new FileWriter(nombreArchivo);

            writer.write("Archivo generado por el sistema de torneo.\n");

            writer.close();

            System.out.println("Archivo exportado correctamente.");

        } catch (IOException e) {

            System.out.println("Error al exportar: " + e.getMessage());
        }
    }

    public void exportarSelecciones(Torneo torneo, String nombreArchivo) {

        try {

            FileWriter writer = new FileWriter(nombreArchivo);

            writer.write("Pais,Confederacion,Puntos\n");

            for (Grupo grupo : torneo.getGrupos()) {

                for (Seleccion seleccion : grupo.getSelecciones()) {

                    writer.write(
                            seleccion.getPais() + "," +
                                    seleccion.getConfederacion() + "," +
                                    seleccion.getPuntos() + "\n"
                    );
                }
            }

            writer.close();

            System.out.println("Datos exportados correctamente.");

        } catch (IOException e) {

            System.out.println("Error al exportar: " + e.getMessage());
        }
    }
}