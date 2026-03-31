package Main.java.Set.OperacoesBasicas.ConjuntoDeConvidados;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public Set<Convidado> getConvidadoSet() {
        return convidadoSet;
    }

    private void setConvidadoSet(Set<Convidado> convidadoSet) {
        this.convidadoSet = convidadoSet;
    }

    public void adicionarConvidado(String nome, int codigoConvidado){
        this.convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvidado){
        Convidado removerConvidado = null;
        for (Convidado c : this.convidadoSet){
            if (c.getCodigoConvidado() == codigoConvidado){
                removerConvidado = c;
                break;
            }
        }
        this.convidadoSet.remove(removerConvidado);
    }

    public void contarConvidados(){
        System.out.println(this.convidadoSet.size());
    }

    public void exibirConvidados(){
        System.out.println(this.convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 355);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 35);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 13);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 77);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(13);

        conjuntoConvidados.contarConvidados();

        conjuntoConvidados.exibirConvidados();
    }
}
