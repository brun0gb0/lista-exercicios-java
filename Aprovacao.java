public class Aprovacao {
/**
 * Retorna apenas os estudantes aprovados,
 * considerando média mínima de 6.
 */
    public static Estudante[] aprovados(Estudante[] estudantes) {

        int quantidadeAprovados = 0;

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i].calculaMedia() >= 6) {
                quantidadeAprovados++;
            }
        }

        if (quantidadeAprovados == 0) {
            return null;
        }

        Estudante[] aprovados = new Estudante[quantidadeAprovados];

        int posicao = 0;

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i].calculaMedia() >= 6) {
                aprovados[posicao] = estudantes[i];
                posicao++;
            }
        }

        return aprovados;
    }
}