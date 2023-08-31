package br.collections.set.conjunto_de_palavras_unicas;

import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private HashSet<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<String>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        for (String palavraString : this.palavras) {
            if (palavraString.equalsIgnoreCase(palavra)) {
                this.palavras.remove(palavraString);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
        for (String palavraString : this.palavras) {
            if (palavraString.equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        for (String palavraString : this.palavras) {
            System.out.println("Palavra: " + palavraString);
        }
    }


    /* @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavras == null) ? 0 : palavras.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavras == null) {
            if (other.palavras != null)
                return false;
        } else if (!palavras.equals(other.palavras))
            return false;
        return true;
    } */

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("PALAVRA1");
        palavrasUnicas.adicionarPalavra("PALAVRA9");
        palavrasUnicas.adicionarPalavra("PALAVRA5");
        palavrasUnicas.adicionarPalavra("PALAVRA4");
        palavrasUnicas.adicionarPalavra("PALAVRA3");
        palavrasUnicas.adicionarPalavra("PALAVRA6");
        palavrasUnicas.adicionarPalavra("PALAVRA7");
        palavrasUnicas.adicionarPalavra("PALAVRA8");
        palavrasUnicas.adicionarPalavra("PALAVRA2");

        palavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A palavra 'PALAVRA8' existe? " + palavrasUnicas.verificarPalavra("PALAVRA8"));

        palavrasUnicas.removerPalavra("PALAVRA8");

        System.out.println("A palavra 'PALAVRA8' existe? " + palavrasUnicas.verificarPalavra("PALAVRA8"));

        palavrasUnicas.exibirPalavrasUnicas();
    }
}
