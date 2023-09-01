package br.collections.map.livraria_online;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LivrariaOnline {
    
    private Map<String, Livro> livraria;

    public LivrariaOnline() {
        this.livraria = new HashMap<String, Livro>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        this.livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        String linkToRemove = "";
        Livro livroToRemove = null;
        for (Livro livro : this.livraria.values()){
                if(livro.getTitulo() == titulo){
                    livroToRemove = livro;
                }
            }
        for(String link : this.livraria.keySet()){
            if(this.livraria.get(link) == livroToRemove){
                linkToRemove = link;
            }
        }

        this.livraria.remove(linkToRemove);
    }



    public void exibirLivrosOrdenadosPorPreco() {
        ArrayList<Livro>livrosOrdenados  = new ArrayList<>(livraria.values());
        Collections.sort(livrosOrdenados , new OrdenacaoPorPreco());
        for(Livro livro : livrosOrdenados){
            System.out.println(
                "Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Preço: " + livro.getPreco()
            );
        }
    }

    public ArrayList<Livro> pesquisarLivrosPorAutors(String autor){
        ArrayList<Livro> listaLivrosDoAutor = new ArrayList<Livro>();

        for(Livro livro : this.livraria.values()){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                listaLivrosDoAutor.add(livro);
            }
        }

        return listaLivrosDoAutor;
    }

    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double maiorPreco = 0;
        
        for(Livro livro : this.livraria.values()){
            if(livro.getPreco() > maiorPreco){
                maiorPreco = livro.getPreco();
                livroMaisCaro = livro;
            }
        }

        return livroMaisCaro;
    }

    public void exibirLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        
        for(Livro livro : this.livraria.values()){
            if(livro.getPreco() < menorPreco){
                menorPreco = livro.getPreco();
                livroMaisBarato = livro;
            }
        }

        System.out.println(
                "Livro mais barato - Título: " + livroMaisBarato.getTitulo() + ", Autor: " + livroMaisBarato.getAutor() + ", Preço: " + livroMaisBarato.getPreco()
            );

    }

    class OrdenacaoPorPreco implements Comparator<Livro> {

        @Override
        public int compare(Livro o1, Livro o2) {
            return Double.compare(o1.getPreco(), o2.getPreco());
        }
        
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://www.amazon.com.br/dp/8575228056", "Java 1", "Deitel1", 100.00);
        livraria.adicionarLivro("https://www.amazon.com.br/dp/8572286", "Java 2", "Deitel2", 400.00);
        livraria.adicionarLivro("https://www.amazon.com.br/dp/8752056", "Java 3", "Deitel3", 340.00);
        livraria.adicionarLivro("https://www.amazon.com.br/dp/728056", "Java 4", "Deitel4",  90.00);
        livraria.adicionarLivro("https://www.amazon.com.br/dp/8578056", "Java 5", "Deitel5",  10.00);

        livraria.exibirLivrosOrdenadosPorPreco();

        livraria.exibirLivroMaisBarato();

    }
    
    
}
