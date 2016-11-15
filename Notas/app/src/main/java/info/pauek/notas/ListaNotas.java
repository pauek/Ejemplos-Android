package info.pauek.notas;

import java.util.ArrayList;

/**
 * Created by pauek on 15/11/2016.
 */

public class ListaNotas {
    private static ArrayList<Nota> notas;

    public static ArrayList<Nota> get() {
        if (notas == null) {
            notas = new ArrayList<>();
            notas.add(new Nota("hola", "que tal"));
            notas.add(new Nota("1234", "567890"));
        }
        return notas;
    }

    public static void nueva(String titulo, String texto) {
        Nota nota = new Nota(titulo, texto);
        notas.add(nota);
    }

    public static void modifica(int pos, String titulo, String texto) {
        Nota nota = notas.get(pos);
        nota.setTitulo(titulo);
        nota.setTexto(texto);
    }

    public static Nota getNota(int pos) {
        return notas.get(pos);
    }
}
