/* Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista de números.
calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista. */

package br.collections.list.soma_de_numeros;

import java.util.ArrayList;

public class SomaNumeros {
    private ArrayList<Integer> listaDeNumeros;

    public SomaNumeros() {
        this.listaDeNumeros = new ArrayList<Integer>();
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

    public void adcionarNumero(Integer numero) {
        this.listaDeNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : this.listaDeNumeros) {
            soma += numero;
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = this.listaDeNumeros.get(0);

        for (Integer numero : this.listaDeNumeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = this.listaDeNumeros.get(0);

        for (Integer numero : this.listaDeNumeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        return menorNumero;

    }

    public void exibirNumeros() {
        for (Integer numero : this.listaDeNumeros) {
            System.out.println("Número: " + numero);
        }
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adcionarNumero(1);
        numeros.adcionarNumero(10);
        numeros.adcionarNumero(2);
        numeros.adcionarNumero(300);
        numeros.adcionarNumero(1002);
        numeros.adcionarNumero(-5);
        numeros.adcionarNumero(45);
        numeros.adcionarNumero(9);
        numeros.adcionarNumero(53);

        numeros.exibirNumeros();

        System.out.println("Maior número: " + numeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + numeros.encontrarMenorNumero());
        System.out.println("Soma: " + numeros.calcularSoma());
    }

    

}