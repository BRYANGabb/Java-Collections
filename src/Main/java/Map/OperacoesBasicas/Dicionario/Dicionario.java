package Main.java.Map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioSet;

    public Dicionario() {
        this.dicionarioSet = new HashMap<>();
    }

    public Map<String, String> getDicionarioSet() {
        return new HashMap<>(this.dicionarioSet);
    }

    public void adicionarioPalavra(String palavra, String definicao){
        this.dicionarioSet.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!this.dicionarioSet.isEmpty()){
            this.dicionarioSet.remove(palavra);
        } else {
            System.out.println("Dicionario vazio!");
        }
    }

    public void exibirPalavras(){
        if (!this.dicionarioSet.isEmpty()){
            System.out.println(this.dicionarioSet);
        } else {
            System.out.println("Dicionario vazio!");
        }
    }

    public String pesquisarDefinicaoPorPalavra(String palavra){
        String palavraDefinicao = null;
        if (!this.dicionarioSet.isEmpty()){
            palavraDefinicao = this.dicionarioSet.get(palavra);
        }
        return palavraDefinicao;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        //dicionario.exibirPalavras();

        dicionario.adicionarioPalavra("Casa", "Lugar onde as pessoas moram");
        dicionario.adicionarioPalavra("Banco", "Lugar onde se guarda dinheiro");
        dicionario.adicionarioPalavra("Livro", "Conjunto de páginas com texto para leitura");
        dicionario.adicionarioPalavra("Água", "Líquido essencial para a vida");
        dicionario.adicionarioPalavra("Banco", "Assento para sentar");

        //dicionario.exibirPalavras();

        dicionario.removerPalavra("Casa");

        dicionario.exibirPalavras();

    System.out.println("Definicão: " + dicionario.pesquisarDefinicaoPorPalavra("Água"));
    }
}
