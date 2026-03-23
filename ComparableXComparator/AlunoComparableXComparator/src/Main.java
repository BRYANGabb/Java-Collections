import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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