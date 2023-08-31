package br.collections.set.gerenciador_de_alunos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos(HashSet<Aluno> alunos) {
        this.alunos = new HashSet<Aluno>(alunos);
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        this.alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getMatricula() == matricula) {
                alunos.remove(aluno);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosOrdenados = new TreeSet<>(this.alunos);
        exibirAlunos(alunosOrdenados);

        return alunosOrdenados;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosOrdenados = new TreeSet<>(new OrdenacaoPorNota());
        alunosOrdenados.addAll(this.alunos);

        exibirAlunos(alunosOrdenados);
        return alunosOrdenados;

    }

    public void exibirAlunos(Set<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(
                    "Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula() + ", Nota: " + aluno.getNota());
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos(new HashSet<Aluno>());

        alunos.adicionarAluno("José", 1L, 4.5);
        alunos.adicionarAluno("Maria", 2L, 9.5);
        alunos.adicionarAluno("Pedro", 3L, 3.0);
        alunos.adicionarAluno("Carlos", 4L, 2.5);
        alunos.adicionarAluno("Augusto", 5L, 7.2);

        alunos.exibirAlunos(alunos.alunos);
        System.out.println("\n");
        
        alunos.exibirAlunosPorNome();
        System.out.println("\n");

        alunos.exibirAlunosPorNota();
    }
}

class OrdenacaoPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }

}