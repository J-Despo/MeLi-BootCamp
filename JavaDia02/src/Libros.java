public class Libros {

    public static void main( String[] args )
    {
        Libro libro = new Libro("Harry Potter", 2938193, "Rowling J.K.");
        System.out.println(libro);
    }
}

class Libro {

    private String titulo;
    private int isbn;
    private String autor;

    Libro() {}

    Libro(String titulo, int isbn, String autor) {
        this.setTitulo(titulo);
        this.setIsbn(isbn);
        this.setAutor(autor);
    }

    Libro(Libro l) {
        this.setTitulo(l.getTitulo());
        this.setIsbn(l.getIsbn());
        this.setAutor(l.getAutor());
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void prestamo() {
    }

    public void devolucion() {
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s", this.getTitulo(), this.getIsbn(), this.getAutor());
    }
}


