package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public List<Tarefa> getTarefasList() {
        return tarefasList;
    }

    private void setTarefasList(List<Tarefa> tarefasList) {
        this.tarefasList = tarefasList;
    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List <Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefasList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int totalTarefas(){
        return tarefasList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {

        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Tarefa 01");
        tarefas.adicionarTarefa("Tarefa 01");
        tarefas.adicionarTarefa("Tarefa 01");
        tarefas.adicionarTarefa("Tarefa 02");
        tarefas.adicionarTarefa("Tarefa 03");
        tarefas.adicionarTarefa("Tarefa 01");

        tarefas.obterDescricoesTarefas();

        System.out.println(tarefas.totalTarefas());

        tarefas.removerTarefa("Tarefa 01");

        tarefas.obterDescricoesTarefas();

    }
}
