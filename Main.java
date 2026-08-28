public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro("O Senhor dos Anéis");

        Periodico periodico = new Periodico(
            "Revista Ciência Hoje",
            25
        );

        System.out.println("LIVRO");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Disponível: " + livro.isDisponivel());

        livro.emprestar();

        System.out.println("Disponível: " + livro.isDisponivel());

        livro.devolver();

        System.out.println("Disponível: " + livro.isDisponivel());

        System.out.println("\nPERIÓDICO");
        System.out.println("Título: " + periodico.getTitulo());
        System.out.println("Volume: " + periodico.getNumeroVolume());
    }
}