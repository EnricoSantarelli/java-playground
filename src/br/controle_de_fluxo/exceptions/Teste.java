package br.controle_de_fluxo.exceptions;

public abstract class Teste {
    public void teste(){
        System.out.println("Iniciando teste");
        testador();
    }

    abstract void testador();
}
