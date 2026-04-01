package Main.java.Set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public Set<String> getPalavrasUnicas() {
        return palavrasUnicas;
    }

    private void setPalavrasUnicas(Set<String> palavrasUnicas) {
        this.palavrasUnicas = palavrasUnicas;
    }

    public void adicionarPalavra(String palavra){
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!this.palavrasUnicas.isEmpty()){
            if (this.palavrasUnicas.contains(palavra)){
                this.palavrasUnicas.remove(palavra);
            } else{
                System.out.println("Palavra não encontrada no Conjunto");
            }
        } else{
            System.out.println("Conjunto de palavras vazia!");
        }
    }

    public boolean verificarPalavra(String palavra){
        return this.palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(this.palavrasUnicas);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(palavrasUnicas, that.palavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavrasUnicas);
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Agua");
        palavrasUnicas.adicionarPalavra("Uva");
        palavrasUnicas.adicionarPalavra("Arroz");
        palavrasUnicas.adicionarPalavra("Banana");
        palavrasUnicas.adicionarPalavra("Arroz");
        palavrasUnicas.adicionarPalavra("Carne");

        System.out.println(palavrasUnicas.verificarPalavra("Abc") ? "Existe" : "Não existe");

        palavrasUnicas.removerPalavra("Banana");

        palavrasUnicas.exibirPalavrasUnicas();
    }
}
