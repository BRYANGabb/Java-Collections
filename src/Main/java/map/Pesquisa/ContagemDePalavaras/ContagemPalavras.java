package Main.java.map.Pesquisa.ContagemDePalavaras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public Map<String, Integer> getContagemPalavrasMap() {
        return new HashMap<>(this.contagemPalavrasMap);
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!this.contagemPalavrasMap.isEmpty()){
            this.contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("Contagem de palavras vazia!");
        }
    }

    public void exibirContagemPalavras(){
        if (!this.contagemPalavrasMap.isEmpty()){
            System.out.println(this.contagemPalavrasMap);
        } else {
            System.out.println("Contagem de palavras vazia!");
        }
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;
        if (!this.contagemPalavrasMap.isEmpty()){
            for (Map.Entry<String, Integer> entry : this.contagemPalavrasMap.entrySet()){
                if (entry.getValue() >= maiorContagem){
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {

        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 23);
        contagemPalavras.adicionarPalavra("Arroz", 5);
        contagemPalavras.adicionarPalavra("Mouse", 1);
        contagemPalavras.adicionarPalavra("Livro", 5);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Mouse");

        contagemPalavras.exibirContagemPalavras();

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
