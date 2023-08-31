/* Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
removerItem(String nome): Remove um item do carrinho com base no seu nome.
calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades. */

package br.collections.list.carrinho_de_compras;


public class Teste {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Manteiga", 4.00, 1);
        carrinhoDeCompras.adicionarItem("Bolacha", 3.50, 5);
        carrinhoDeCompras.adicionarItem("Carne", 20.50, 2);
                carrinhoDeCompras.adicionarItem("Queijo", 8.50, 2);
        carrinhoDeCompras.adicionarItem("Frango", 13.00,  10);
        carrinhoDeCompras.adicionarItem("Queijo", 8.50, 2);

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total do carrinho é de R$" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Queijo");

        carrinhoDeCompras.exibirItens();

    }
}
