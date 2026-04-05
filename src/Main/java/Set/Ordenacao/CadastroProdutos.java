package Main.java.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public Set<Produto> getProdutoSet() {
        return new HashSet<>(produtoSet);
    }

    private void setProdutoSet(Set<Produto> produtoSet) {
        this.produtoSet = produtoSet;
    }

    public void adicionarProduto(long cod, String nome, double preco, int quant){
        this.produtoSet.add(new Produto(cod, nome, preco, quant));
    }

    public void exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(this.produtoSet);
        System.out.println(produtosPorNome);
    }

    public void exibirProdutoPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(this.produtoSet);
        System.out.println(produtosPorPreco);
    }

    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1, "Teclado", 100.0, 10);
        produtos.adicionarProduto(2, "Mouse", 50.0, 20);
        produtos.adicionarProduto(3, "Monitor", 900.0, 5);
        produtos.adicionarProduto(4, "Notebook", 3000.0, 2);
        produtos.adicionarProduto(5, "Headset", 200.0, 8);
        produtos.adicionarProduto(3, "Monitor Sam", 900.0, 5);

        produtos.exibirProdutosPorNome();

        produtos.exibirProdutoPorPreco();
    }
}
