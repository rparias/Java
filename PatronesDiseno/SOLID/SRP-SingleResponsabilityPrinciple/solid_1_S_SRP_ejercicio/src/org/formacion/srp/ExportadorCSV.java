package org.formacion.srp;

import java.util.List;
import java.util.stream.Collectors;

public class ExportadorCSV {

    /**
     * @param peliculaList con la lista de peliculas para exportar a csv, no importa quien haya sido el cliente
     * @return string en formato csv
     */
    public static String exportar(List<Pelicula> peliculaList) {
        return peliculaList.stream()
                .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
                .collect(Collectors.joining("\n"));
    }
}
