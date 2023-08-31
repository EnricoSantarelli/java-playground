package br.collections.set.lista_de_tarefas;

import java.util.HashSet;

public class ListaTarefas {
    private HashSet<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                this.tarefas.remove(tarefa);
            }
        }
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : this.tarefas) {
            System.out.println("Descrição: " + tarefa.getDescricao() + ", Concluída: " + tarefa.getConcluida());
        }
    }

    public int contarTarefas() {
        return this.tarefas.size();
    }

    public ListaTarefas obterTarefasConcluidas() {
        ListaTarefas tarefasConcluidas = new ListaTarefas();

        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getConcluida() == true) {
                tarefasConcluidas.adicionarTarefa(tarefa.getDescricao());
            }
        }

        for (Tarefa tarefa : tarefasConcluidas.tarefas) {
            tarefa.setConcluida(true);
        }

        return tarefasConcluidas;
    }

    public ListaTarefas obterTarefasPendentes() {
        ListaTarefas tarefasPendentes = new ListaTarefas();

        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getConcluida() == true) {
                tarefasPendentes.adicionarTarefa(tarefa.getDescricao());
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        this.tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("TAREFA1");
        tarefas.adicionarTarefa("TAREFA2");
        tarefas.adicionarTarefa("TAREFA3");
        tarefas.adicionarTarefa("TAREFA4");
        tarefas.adicionarTarefa("TAREFA5");
        tarefas.adicionarTarefa("TAREFA6");
        tarefas.adicionarTarefa("TAREFA7");
        tarefas.adicionarTarefa("TAREFA8");
        tarefas.adicionarTarefa("TAREFA9");

        tarefas.exibirTarefas();

        System.out.println("\n");

        tarefas.marcarTarefaConcluida("TAREFA1");
        tarefas.marcarTarefaConcluida("TAREFA2");
        tarefas.marcarTarefaConcluida("TAREFA3");
        tarefas.marcarTarefaConcluida("TAREFA4");
        tarefas.marcarTarefaConcluida("TAREFA5");

        tarefas.exibirTarefas();

        System.out.println("\n");

        tarefas.contarTarefas();

        tarefas.obterTarefasConcluidas().exibirTarefas();

        System.out.println("\n");

        tarefas.obterTarefasPendentes().exibirTarefas();

        System.out.println("\n");

        tarefas.limparListaTarefas();

        tarefas.exibirTarefas();
    }
}
