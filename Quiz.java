import java.util.Scanner;

class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Questao q1 = new Questao();
        q1.enunciado = "Qual a cor do cavalo branco de Napoleão?";
        q1.alternativas[0] = "Verde";
        q1.alternativas[1] = "Azul";
        q1.alternativas[2] = "Branco";
        q1.alternativaCorreta = 'c';

        Questao q2 = new Questao();
        q2.enunciado = "Complete: Quem descobriu o Brasil? Pedro Alvarez Ca...";
        q2.alternativas[0] = "bral";
        q2.alternativas[1] = "brel";
        q2.alternativas[2] = "bril";
        q2.alternativaCorreta = 'a';

        Questao[] quiz = new Questao[2];
        quiz[0] = q1;
        quiz[1] = q2;

        int indexQuestao = 0;
        int acertos = 0;
        for (Questao q : quiz) {
            imprima(indexQuestao + 1 + " - " + q.enunciado);
            char[] letras = new char[3];
            letras[0] = 'a';
            letras[1] = 'b';
            letras[2] = 'c';
            int indexLetra = 0;
            for (String a : q.alternativas) {
                imprima("" + letras[indexLetra] + ")" + a);
                indexLetra++;
            }

            char alternativa = scan.nextLine().charAt(0);
            if (alternativa == q.alternativaCorreta) {
                acertos++;
            }
            indexQuestao++;
        }
        double resultado = ((double) acertos / quiz.length) * 100;
        imprima("voce acertou " + acertos + " de " + quiz.length + " questoes, equivalente a " + resultado + "% de acerto.");
        scan.close();
    }

    public static void imprima(String texto) {
        System.out.println(texto);
    }
}

class Questao {
    String enunciado;
    String[] alternativas = new String[3];
    char alternativaCorreta;
}