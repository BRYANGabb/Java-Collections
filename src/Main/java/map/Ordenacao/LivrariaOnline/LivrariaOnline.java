package Main.java.map.Ordenacao.LivrariaOnline;

import java.util.*;

import static java.util.Collections.sort;

public class LivrariaOnline {

    Map<String, Livro> livrariaOnlineMap;

    public LivrariaOnline() {
        this.livrariaOnlineMap = new HashMap<>();
    }

    public Map<String, Livro> getLivrariaOnlineMap() {
        return new HashMap<>(this.livrariaOnlineMap);
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        this.livrariaOnlineMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        Livro livroParaRemover = null;
        if (!this.livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : this.livrariaOnlineMap.entrySet()){
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    this.livrariaOnlineMap.remove(entry.getKey(), entry.getValue());
                    livroParaRemover = entry.getValue();
                    break;
                }
            }
        }

        if (livroParaRemover != null){
            System.out.println("LIvro: " + livroParaRemover.getTitulo() + " removido!");
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPreco = new ArrayList<>(this.livrariaOnlineMap.entrySet());

        Collections.sort(livrosParaOrdenarPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosAutor = new HashMap<>();
        if (!this.livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : this.livrariaOnlineMap.entrySet()) {
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return livrosAutor;
    }

    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double livroPreco = Double.MIN_VALUE;
        if (!this.livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : this.livrariaOnlineMap.entrySet()){
                if (entry.getValue().getPreco() >= livroPreco){
                    livroPreco = entry.getValue().getPreco();
                    livroMaisCaro = entry.getValue();
                }
            }
        }

        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double livroPreco = Double.MAX_VALUE;
        if (!this.livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : this.livrariaOnlineMap.entrySet()){
                if (entry.getValue().getPreco() <= livroPreco){
                    livroPreco = entry.getValue().getPreco();
                    livroMaisBarato = entry.getValue();
                }
            }
        }

        return livroMaisBarato;
    }

    public static void main(String[] args) {

        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://exemplo.com/livro1",
                "Clean Code",
                "Robert C. Martin",
                120.00);
        livrariaOnline.adicionarLivro("https://exemplo.com/livro2",
        "Entendendo Algoritmos",
                "Aditya Bhargava",
                85.50);
        livrariaOnline.adicionarLivro("https://exemplo.com/livro3",
                "Java: Como Programar",
                "Paul Deitel",
                150.00);
        livrariaOnline.adicionarLivro("https://exemplo.com/livro4",
                "Código Limpo na Prática",
                "João Silva",
                95.90);
        livrariaOnline.adicionarLivro("https://exemplo.com/livro6",
                "Clean Architecture",
                "Robert C. Martin",
                130.00);

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Robert C. Martin"));

        //System.out.println(livrariaOnline.obterLivroMaisCaro());

        //System.out.println(livrariaOnline.obterLivroMaisBarato());

        livrariaOnline.removerLivro("Código Limpo na Prática");

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

    }

}
