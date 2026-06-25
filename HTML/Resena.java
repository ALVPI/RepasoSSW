package HTML.CSS;

public class Resena {
    private String tituloObra;
    private String tipo; // Puede ser "Pelicula" o "Serie"
    private int puntuacion; // Del 1 al 5
    private String comentario;
    private boolean recomendada;

    public Resena(String tituloObra, String tipo, int puntuacion, String comentario, boolean recomendada) {
        this.tituloObra = tituloObra;
        this.tipo = tipo;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.recomendada = recomendada;
    }

    // Getters
    public String getTituloObra() { return tituloObra; }
    public String getTipo() { return tipo; }
    public int getPuntuacion() { return puntuacion; }
    public String getComentario() { return comentario; }
    public boolean isRecomendada() { return recomendada; }
}