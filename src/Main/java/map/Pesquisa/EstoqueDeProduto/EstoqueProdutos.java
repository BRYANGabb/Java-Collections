package Main.java.map.Pesquisa.EstoqueDeProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public Map<Long, Produto> getEstoqueProdutosMap() {
        return new HashMap<>(this.estoqueProdutosMap);
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        this.estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        if (!this.estoqueProdutosMap.isEmpty()){
            System.out.println(this.estoqueProdutosMap);
        } else {
            System.out.println("Estoque de produtos vazia!");
        }
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        if (!this.estoqueProdutosMap.isEmpty()){
            for (Produto p : this.estoqueProdutosMap.values()){
                valorTotal += p.getPreco() * p.getQuantidade() ;
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double valorMaisCaro = Double.MIN_VALUE;
        if (!this.estoqueProdutosMap.isEmpty()){
            for (Produto p : this.estoqueProdutosMap.values()){
                if (p.getPreco() >= valorMaisCaro){
                    valorMaisCaro = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double valorMaisBarato = Double.MAX_VALUE;
        if (!this.estoqueProdutosMap.isEmpty()){
            for (Produto p : this.estoqueProdutosMap.values()){
                if (p.getPreco() <= valorMaisBarato){
                    valorMaisBarato = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantValor = null;
        double maiorValor = Double.MIN_VALUE;
        if (!this.estoqueProdutosMap.isEmpty()){
            for (Produto p : this.estoqueProdutosMap.values()){
                if ((p.getPreco() * p.getQuantidade()) >= maiorValor){
                    maiorValor = (p.getPreco() * p.getQuantidade());
                    produtoMaiorQuantValor = p;
                }
            }
        }
        return produtoMaiorQuantValor;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Arroz", 25.50, 10);
        estoqueProdutos.adicionarProduto(2, "Feijão", 8.99, 20);
        estoqueProdutos.adicionarProduto(3, "Macarrão", 4.75, 15);
        estoqueProdutos.adicionarProduto(4, "Leite", 6.30, 12);
        estoqueProdutos.adicionarProduto(5, "Café", 18.90, 8);

        //estoqueProdutos.exibirProdutos();

        //System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

        System.out.println(estoqueProdutos.obterProdutoMaisBarato());

        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
