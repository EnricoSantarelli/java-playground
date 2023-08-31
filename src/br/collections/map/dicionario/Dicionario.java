package br.collections.map.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<String, String>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        this.dicionario.remove(palavra);
    }

    public void exibirPalavras(){
        for(String palavra : this.dicionario.keySet()){
            System.out.println(palavra + " : " + this.dicionario.get(palavra));
        }
    }

    public String pesquisarPorPalavra(String palavra){
        return this.dicionario.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra", "Sequência de letras");
        dicionario.adicionarPalavra("Vaca", "Animal preto e branco");
        dicionario.adicionarPalavra("Tijolo", "Não sei");
        dicionario.adicionarPalavra("Mouse", "Rato em inglês");
        dicionario.adicionarPalavra("Mentira", "Contrário de verdade");

        dicionario.exibirPalavras();

        System.out.println(
                "\n");

        System.out.println("Significado da palavra Mouse: " + dicionario.pesquisarPorPalavra("Mouse"));

        dicionario.removerPalavra("Mouse");

        System.out.println(
                "\n");

        dicionario.exibirPalavras();


    }
}
