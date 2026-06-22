package Encapsulamiento;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public boolean esLargo() {
        return paginas >= 300;
    }

    public void mostrarLibro() {
        System.out.println("EL TITULO ES: " + titulo);
        System.out.println("EL AUTOR ES: " + autor);
        System.out.println("CANTIDAD DE PAGINAS: " + paginas);
    }
}