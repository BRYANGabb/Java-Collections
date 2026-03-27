package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List <Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public List<Item> getItens() {
        return itensList;
    }

    private void setItens(List<Item> itens) {
        this.itensList = itens;
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itensList.add(item);
    }

    public void removerItem(String nome){
        List <Item> itemParaRemover = new ArrayList<>();
        for (Item i : itensList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        this.itensList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double valorTot = 0;
        for (Item i : itensList){
            double soma = i.getPreco() * i.getQuantidade();
            valorTot += soma;
        }
        return valorTot;
    }

    public void exibirItens(){
        System.out.println(itensList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 14.5f, 3);
        carrinho.adicionarItem("Arroz", 14.5f, 3);
        carrinho.adicionarItem("Arroz", 14.5f, 3);
        carrinho.adicionarItem("Feijão", 5f, 1);

        carrinho.removerItem("Arroz");

        System.out.println(carrinho.calcularValorTotal());

        carrinho.exibirItens();
    }
}

