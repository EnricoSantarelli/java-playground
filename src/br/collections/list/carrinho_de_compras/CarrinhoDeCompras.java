package br.collections.list.carrinho_de_compras;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Item> listaDeItens;
    
    public CarrinhoDeCompras(){
        this.listaDeItens = new ArrayList<>();
    }

    

    /**
     * @return List<Item> return the listaDeItens
     */
    public ArrayList<Item> getListaDeItens() {
        return listaDeItens;
    }

    /**
     * @param listaDeItens the listaDeItens to set
     */
    public void setListaDeItens(ArrayList<Item> listaDeItens) {
        this.listaDeItens = listaDeItens;
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        ArrayList<Item> listaDeItensASeremRemovidos = new ArrayList<>();
        for(Item item : this.listaDeItens){
            if(item.getNome().equalsIgnoreCase(nome)){
                listaDeItensASeremRemovidos.add(item);
            }
        }
        
        this.listaDeItens.removeAll(listaDeItensASeremRemovidos);
    }

    public double calcularValorTotal(){
        double valor = 0;

        for(Item item : this.listaDeItens){
            valor += item.getQuantidade() * item.getPreco();
        }

        return valor;
    }

    public void exibirItens(){
        for(Item item : this.listaDeItens){
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
        }
    }

}
