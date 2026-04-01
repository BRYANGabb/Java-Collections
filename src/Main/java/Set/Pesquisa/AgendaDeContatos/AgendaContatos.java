package Main.java.Set.Pesquisa.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public Set<Contato> getContatosSet() {
        return new HashSet<>(this.contatosSet);
    }

    private void setContatosSet(Set<Contato> contatosSet) {
        this.contatosSet = contatosSet;
    }

    public void adicionarContato(String nome, int numero){
        this.contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if (!this.contatosSet.isEmpty()){
            System.out.println(this.contatosSet);
        } else{
            System.out.println("Lista de contatos vazia!");
        }
    }

    public Set<Contato> pesquisarmPorNome(String nome){
        Set<Contato> contatoPesquisaNome = new HashSet<>();
        if (!this.contatosSet.isEmpty()){
            for (Contato c : this.contatosSet){
                if (c.getNome().startsWith(nome)){
                    contatoPesquisaNome.add(c);
                }
            }
        } else{
            System.out.println("Lista de contatos vazia!");
        }
        return contatoPesquisaNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if (!this.contatosSet.isEmpty()){
            for (Contato c : this.contatosSet){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.atualizarNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        } else {
            System.out.println("Lista de contatos vazia!");
        }
        return contatoAtualizado;
    }

    public static void main(String[] args){

        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Bryan", 235346);
        contatos.adicionarContato("Bryan  Gabriel", 757689);
        contatos.adicionarContato("Contato 1", 68764373);
        contatos.adicionarContato("Mirella", 57563989);
        contatos.adicionarContato("Br", 2723839);
        contatos.adicionarContato("Gabriel", 267238);

        contatos.exibirContatos();

        System.out.println(contatos.pesquisarmPorNome("Br"));

        System.out.println(contatos.atualizarNumeroContato("Bryan", 1));
    }
}
