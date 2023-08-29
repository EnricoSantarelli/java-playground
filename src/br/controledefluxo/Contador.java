package br.controledefluxo;
import java.util.Scanner;

import br.controledefluxo.exceptions.ParametrosInvalidosException;


public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = sc.nextInt();

        sc.close();

        try{
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } 

    }

    public static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 > num2){
            throw new ParametrosInvalidosException();
        }

        for(int i = 1; i <= num2 - num1; i++ ){
                System.out.println("Imprimindo o número " + i);
        }
    }
}
