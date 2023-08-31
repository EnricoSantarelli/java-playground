/* Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista.
ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections. */

package br.collections.list.ordenacao_de_numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoNumeros {
    private ArrayList<Integer> listaDeNumeros;

    public OrdenacaoNumeros(ArrayList<Integer> numeros) {
        this.listaDeNumeros = numeros;
    }

    /**
     * @return ArrayList<Integer> return the listaDeNumeros
     */
    public ArrayList<Integer> getListaDeNumeros() {
        return listaDeNumeros;
    }

    /**
     * @param listaDeNumeros the listaDeNumeros to set
     */
    public void setListaDeNumeros(ArrayList<Integer> listaDeNumeros) {
        this.listaDeNumeros = listaDeNumeros;
    }

    public void adicionarNumero(int numero) {
        this.listaDeNumeros.add(numero);
    }

    public OrdenacaoNumeros ordenarAscendente() {
        ArrayList<Integer> listaAscendente = new ArrayList<Integer>(this.listaDeNumeros);

        Collections.sort(listaAscendente);
        return new OrdenacaoNumeros(listaAscendente);
    }

    public OrdenacaoNumeros ordenarDescendente() {
        ArrayList<Integer> listaDescendente = new ArrayList<Integer>(this.listaDeNumeros);

        Collections.sort(listaDescendente, new OrdenacaoDescendente());
        return new OrdenacaoNumeros(listaDescendente);
    }

    public void exibirNumeros() {
        for (Integer numero : this.listaDeNumeros) {
            System.out.println("Número: " + numero);
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros(new ArrayList<Integer>());

        listaNumeros.adicionarNumero(1);
        listaNumeros.adicionarNumero(10);
        listaNumeros.adicionarNumero(2);
        listaNumeros.adicionarNumero(300);
        listaNumeros.adicionarNumero(1002);
        listaNumeros.adicionarNumero(-5);
        listaNumeros.adicionarNumero(45);
        listaNumeros.adicionarNumero(9);
        listaNumeros.adicionarNumero(53);

        OrdenacaoNumeros listaDescendente = listaNumeros.ordenarDescendente();
        OrdenacaoNumeros listaAscendente = listaNumeros.ordenarAscendente();

        System.out.println(
                "Lista descendente:");

        listaDescendente.exibirNumeros();

        System.out.println(
                "\nLista ascendente:");

        listaAscendente.exibirNumeros();

    }

}

class OrdenacaoDescendente implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {
        return Integer.compare(num2, num1);
    }

}
