/**
 * Superclasse que representa uma publicação da biblioteca.
 * Reúne as características comuns aos livros e periódicos.
 */

public class Publicacao {

    private String titulo;

    public Publicacao(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}