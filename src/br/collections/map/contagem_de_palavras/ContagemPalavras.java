package br.collections.map.contagem_de_palavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras(){
        this.contagemPalavras = new HashMap<String, Integer>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        this.contagemPalavras.remove(palavra);
    }

    public void exibirContagemPalavras(){
        for(String palavra : this.contagemPalavras.keySet()){
            System.out.println(palavra + " : " + this.contagemPalavras.get(palavra) + " vezes");
        }
    }

    public ContagemPalavras encontrarPalavraMaisFrequente(){
        String palavra = "";
        int contagemMaisFrequente = 0;
        for(String palavraString : this.contagemPalavras.keySet()){
            if(this.contagemPalavras.get(palavraString) > contagemMaisFrequente){
                contagemMaisFrequente = this.contagemPalavras.get(palavraString);
                palavra = palavraString;
            }
        }
        ContagemPalavras contagemPalavrasClass = new ContagemPalavras();
        contagemPalavrasClass.adicionarPalavra(palavra, contagemMaisFrequente);
        return contagemPalavrasClass;
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Um", 1);
        contagem.adicionarPalavra("Dois", 2);
        contagem.adicionarPalavra("Três", 3);
        contagem.adicionarPalavra("Quatro", 4);
        contagem.adicionarPalavra("Cinco", 5);

        contagem.exibirContagemPalavras();

        System.out.println(
            "\n");

            contagem.encontrarPalavraMaisFrequente().exibirContagemPalavras();;
        
            System.out.println(
            "\n");
    }
}
