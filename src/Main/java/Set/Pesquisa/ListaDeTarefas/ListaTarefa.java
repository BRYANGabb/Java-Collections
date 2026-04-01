package Main.java.Set.Pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public Set<Tarefa> getTarefaSet() {
        return new HashSet<>(this.tarefaSet);
    }

    private void setTarefaSet(Set<Tarefa> tarefaSet) {
        this.tarefaSet = tarefaSet;
    }

    public void adicionarTarefa(String descricao){
        this.tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!this.tarefaSet.isEmpty()){
            for (Tarefa t : this.tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    this.tarefaSet.remove(tarefaParaRemover);
                    break;
                }
            }
            System.out.println("Tarefa removida!");
        } else{
            System.out.println("Lista de tarefa vazia!");
        }

        if (tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas(){
        System.out.println(this.getTarefaSet());
    }

    public int contarTarefas(){
        return this.getTarefaSet().size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set <Tarefa> tarefasConcluidas = new HashSet<>();
        if (!this.tarefaSet.isEmpty()){
            for (Tarefa t : this.tarefaSet){
                if (t.isTarefaConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!this.tarefaSet.isEmpty()){
            for (Tarefa t : this.tarefaSet){
                if (!t.isTarefaConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefaMarcarConcluida = null;
        if (!this.tarefaSet.isEmpty()){
            for (Tarefa t : this.tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaMarcarConcluida = t;
                    break;
                }
            }
        } else {
            System.out.println("Lista de tarefas vazia!");
        }

        if (tarefaMarcarConcluida != null){
            tarefaMarcarConcluida.tarefaConcluida();
            System.out.println("Tarefa Concluida! " + tarefaMarcarConcluida.getDescricao());
        } else {
            System.out.println("Tarefa não encontrada!");
        }

    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaMarcarPendente = null;
        if (!this.tarefaSet.isEmpty()){
            for (Tarefa t : this.tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaMarcarPendente = t;
                    break;
                }
            }
        } else {
            System.out.println("Lista de tarefas vazia!");
        }

        if (tarefaMarcarPendente != null){
            tarefaMarcarPendente.tarefaPendente();
            System.out.println("Tarefa Pendente! " + tarefaMarcarPendente.getDescricao());
        } else {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void limparListaTarefas(){
        this.tarefaSet.clear();
        System.out.println("Lista de tarefas resetada!!");
    }

    public static void main(String[] args) {

        ListaTarefa tarefas = new ListaTarefa();

        tarefas.adicionarTarefa("Beber agua");
        tarefas.adicionarTarefa("Estudar");
        tarefas.adicionarTarefa("Correr");
        tarefas.adicionarTarefa("Entregar trabalho");

        System.out.println(tarefas.contarTarefas());

        tarefas.exibirTarefas();

        tarefas.marcarTarefaConcluida("beber agua");

        tarefas.marcarTarefaConcluida("estudar");

        tarefas.marcarTarefaConcluida("correr");

        System.out.println(tarefas.obterTarefasConcluidas());

        tarefas.marcarTarefaPendente("correr");

        System.out.println(tarefas.obterTarefasPendentes());

        tarefas.limparListaTarefas();
    }
}
