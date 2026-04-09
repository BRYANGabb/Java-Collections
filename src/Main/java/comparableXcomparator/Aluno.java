import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aluno implements Comparable <Aluno>{
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno outro) {
        int nota = Double.compare(outro.getNota(), this.getNota());

        if (nota != 0){
            return nota;
        }

        return this.getNome().compareTo(outro.getNome());
    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Bryan", 7.8f));
        alunos.add(new Aluno("Bryan", 8f));
        alunos.add(new Aluno("Bryan", 3f));
        alunos.add(new Aluno("A", 4f));
        alunos.add(new Aluno("Mirella", 10f));
        alunos.add(new Aluno("d", 3.44f));
        /*Collections.sort(alunos);
        for (Aluno aluno : alunos){
            System.out.println(aluno.toString());
        }*/
        /*Collections.sort(alunos, new OrdenarNome());
        for (Aluno aluno : alunos){
            System.out.println(aluno.toString());
        }*/
        Collections.sort(alunos, new OrdenarMenorNotaNome());
        for (Aluno aluno: alunos){
            System.out.println(aluno.toString());
        }
    }
}

class OrdenarNomeAluno implements Comparator <Aluno>{

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.getNome().compareTo(aluno2.getNome());
    }
}

class OrdenarMenorNotaNome implements Comparator <Aluno>{

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        int nota = Double.compare(aluno1.getNota(), aluno2.getNota());

        if (nota != 0){
            return nota;
        }

        return aluno1.getNome().compareTo(aluno2.getNome());
    }
}
