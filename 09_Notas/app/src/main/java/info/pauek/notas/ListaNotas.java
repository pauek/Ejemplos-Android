package info.pauek.notas;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by pauek on 15/11/2016.
 */


// cache

public class ListaNotas {
    private static ArrayList<Nota> notas;

    public static ArrayList<Nota> get() {
        if (notas == null) {
            notas = NotasDB.loadNotas();
        }
        return notas;
    }

    public static Nota getNota(int pos) {
        return notas.get(pos);
    }

    public static void nueva(String titulo, String texto) {
        Nota nota = NotasDB.nueva(titulo, texto);
        notas.add(nota);
    }

    public static void modifica(int pos, String titulo, String texto) {
        Nota nota = notas.get(pos);
        nota.setTitulo(titulo);
        nota.setTexto(texto);
        NotasDB.actualiza(nota);
    }

    public static void borra(int pos) {
        Nota nota = notas.get(pos);
        NotasDB.borra(nota);
        notas.remove(pos);
    }
}
