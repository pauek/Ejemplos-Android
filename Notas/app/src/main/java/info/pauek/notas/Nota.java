package info.pauek.notas;

/**
 * Created by pauek on 08/11/2016.
 */

public class Nota {
    private long id;
    private String titulo;
    private String texto;

    public Nota() {
        this.id = -1;
        this.titulo = "";
        this.texto = "";
    }

    public Nota(long id, String titulo, String texto) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
    }

    public Nota(String titulo, String texto) {
        this.id = -1;
        this.titulo = titulo;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
