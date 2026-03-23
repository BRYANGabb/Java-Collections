import java.util.Comparator;

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
}

class OrdenarNome implements Comparator <Aluno>{

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
