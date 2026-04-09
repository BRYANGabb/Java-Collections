package Main.java.map.OperacoesBasicas.AgendarContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendarContatos {
    private Map<String, Integer> agendarContatoMap;

    public AgendarContatos() {
        this.agendarContatoMap = new HashMap<>();
    }

    public Map<String, Integer> getAgendarContatoMap() {
        return new HashMap<>(this.agendarContatoMap);
    }

    public void adicionarContato(String nome, Integer telefone){
        this.agendarContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!this.agendarContatoMap.isEmpty()){
            this.agendarContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        if (!this.agendarContatoMap.isEmpty()){
            System.out.println(this.agendarContatoMap);
        } else {
            System.out.println("Agendar de contatos vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer telefonePorNome = null;
        if (!this.agendarContatoMap.isEmpty()){
            telefonePorNome = this.agendarContatoMap.get(nome);
        }
        return telefonePorNome;
    }

    public static void main(String[] args) {

        AgendarContatos agendarContatos = new AgendarContatos();

        agendarContatos.adicionarContato("Bryan Gabriel", 25464657);
        agendarContatos.adicionarContato("Mirella", 5786897);
        agendarContatos.adicionarContato("Fabiana", 457886867);
        agendarContatos.adicionarContato("Lima", 57568678);

        agendarContatos.exibirContatos();

        agendarContatos.removerContato("Lima");

        agendarContatos.exibirContatos();

        System.out.println(agendarContatos.pesquisarPorNome("Mirella"));

    }
}
