import java.util.Comparator;

public class Produto implements Comparable <Produto>{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    // Comparar por preço
    @Override
    public int compareTo(Produto outro)
    {
        return Double.compare(this.preco, outro.getPreco());
    }
}

class OrdenarNome implements Comparator <Produto>{

    // Comparar por nome
    @Override
    public int compare(Produto produtoA, Produto produtoB) {
        return produtoA.getNome().compareTo(produtoB.getNome());
    }
}

class OrdenarNomePreco implements Comparator <Produto>{

    // Comparar por nome e preço
    @Override
    public int compare(Produto produtoA, Produto produtoB) {
        int nome = produtoA.getNome().compareTo(produtoB.getNome());

        if (nome != 0){
            return nome;
        }

        return Double.compare(produtoA.getPreco(), produtoB.getPreco());
    }
}