/* Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.

Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

Desafio 4 - Remova todos os valores ímpares:
Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

Desafio 7 - Encontrar o segundo número maior da lista:
Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

Desafio 8 - Somar os dígitos de todos os números da lista:
Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

Desafio 12 - Encontre o produto de todos os números da lista:
Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

Desafio 13 - Filtrar os números que estão dentro de um intervalo:
Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

Desafio 14 - Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

Desafio 16 - Agrupe os números em pares e ímpares:
Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.

Desafio 17 - Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

Desafio 18 - Verifique se todos os números da lista são iguais:
Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
 */

package br.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafios {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 1, 5, 4, 3, 6, 10, 8, 9, 7, 5, 4, 3);

        // Desafio 1
        numeros.stream().sorted((n1, n2) -> n1.compareTo(n2)).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // Desafio 2
        System.out.println(numeros.stream().filter(n1 -> n1 % 2 == 0).reduce((n1, n2) -> n1 + n2).get() + "\n");

        // Desafio 3
        System.out.println("Todos os números são positivos? " + numeros.stream().allMatch(n -> n > 0) + "\n");

        // Desafio 4
        numeros.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        ;
        System.out.println("\n");

        // Desafio 5
        System.out
                .println(numeros.stream().filter(n -> n > 5).reduce((n1, n2) -> n1 + n2).get() / numeros.size() + "\n");

        // Desafio 6
        System.out.println("Algum número maior que 10? " + numeros.stream().anyMatch(n -> n > 10) + "\n");

        // Desafio 7
        List<Integer> listaOrdenada = numeros.stream().sorted((n1, n2) -> n2.compareTo(n1)).toList();
        System.out.println(listaOrdenada.get(1) + "\n");

        // Desafio 8
        System.out.println(numeros.stream().reduce((n1, n2) -> n1 + n2).get() + "\n");

        // Desafio 9
        System.out.print("Os números são distintos? ");
        System.out.print(numeros.stream().distinct().count() == numeros.size());
        System.out.println("\n");

        // Desafio 10
        numeros.stream().filter(n1 -> n1 % 3 == 0 || n1 % 5 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // Desafio 11
        System.out.print(numeros.stream().map(n1 -> n1 * n1).reduce((n1, n2) -> n1 + n2).get());

        // Desafio 12
        System.out.print(numeros.stream().reduce((n1, n2) -> n1 * n2).get());
        System.out.println("\n");

        // Desafio 13
        numeros.stream().filter(num1 -> num1 <= 10 && num1 >= 5).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // Desafio 14
        System.out.print(numeros.stream().filter(num1 -> {
            boolean ehPrimo = true;
            for (int i = num1 - 1; i > 1; i--) {
                if (num1 % i == 0) {
                    ehPrimo = false;
                }
            }
            return ehPrimo;
        }).mapToInt(v -> v)
                .max().getAsInt());
        System.out.println("\n");

        // Desafio 15
        System.out.println("Algum número negativo? " + numeros.stream().anyMatch(n -> n < 0) + "\n");

        // Desafio 16
        numeros.stream().filter(n1 -> n1 % 2 == 0).toList().forEach(n -> System.out.print(n + " "));
        System.out.println(" ");
        numeros.stream().filter(n1 -> n1 % 2 != 0).toList().forEach(n -> System.out.print(n + " "));
        System.out.println("\n");
        
        // Desafio 17
        numeros.stream().filter(num1 -> {
            boolean ehPrimo = true;
            for (int i = num1 - 1; i > 1; i--) {
                if (num1 % i == 0) {
                    ehPrimo = false;
                }
            }
            return ehPrimo;
        }).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // Desafio 18
        System.out.print("Os números são iguais? " +numeros.stream().allMatch(t -> t == numeros.get(0)));
        System.out.println("\n");


        //Desafio 19
        System.out.println(numeros.stream().filter(n1 -> n1 % 3 == 0 || n1 % 5 == 0).reduce((t, u) -> t + u).get());

        
    }
}
