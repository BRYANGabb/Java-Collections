package Main.java.Set.Ordenacao.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public Set<Aluno> getAlunos() {
        return new HashSet<>(this.alunos);
    }

    private void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        this.alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if (!this.alunos.isEmpty()){
            for (Aluno a : this.alunos){
                if (a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }

            if (alunoParaRemover != null){
                System.out.println("Matricula cancelada!");
            } else{
                System.out.println("Matricula não encontrada!");
            }

        } else {
            System.out.println("Lista de alunos vazia");
        }

    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(this.alunos);
        if (!alunosPorNome.isEmpty()){
            System.out.println(alunosPorNome);
        } else{
            System.out.println("Lista de alunos vazia");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunosPorNota());
        alunosPorNota.addAll(this.getAlunos());
        if (!alunosPorNota.isEmpty()){
            System.out.println(alunosPorNota);
        } else{
            System.out.println("Lista de alunos vazia");
        }
    }

    public void exibirAlunos(){
        if (!this.getAlunos().isEmpty()){
            System.out.println(this.getAlunos());
        } else{
            System.out.println("Lista de alunos vazia");
        }
    }

    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        //gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno", 1243, 6.45);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 87643, 8.2);
        gerenciadorAlunos.adicionarAluno("Aluno 7", 46769, 4.7);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 657, 10);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 1243, 7.77);

        //gerenciadorAlunos.exibirAlunos();

        //gerenciadorAlunos.exibirAlunosPorNome();

        //gerenciadorAlunos.exibirAlunosPorNota();

        gerenciadorAlunos.removerAluno(46769);

        gerenciadorAlunos.exibirAlunos();
    }
}
