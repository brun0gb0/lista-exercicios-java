public class Livro extends Publicacao {

    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}