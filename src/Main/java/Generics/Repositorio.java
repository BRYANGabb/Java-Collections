import java.util.ArrayList;
import java.util.List;

public class Repositorio <T> {

    private T item;

    private List <T> itens = new ArrayList<>();

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void adicionarItem(T item){
        this.itens.add(item);
    }

    public void listarItens(){
        for (T i : itens){
            System.out.println(i.toString());
        }
    }

    public void buscarIndice(int indice){
        System.out.println(itens.get(indice));
    }

    @Override
    public String toString() {
        return "\nItem=" + item;
    }

    public static void main(String[] args) {

        Repositorio <String> nomes = new Repositorio<>();

        nomes.adicionarItem("A");
        nomes.adicionarItem("B");
        nomes.adicionarItem("C");
        nomes.adicionarItem("E");
        nomes.adicionarItem("F");
        nomes.listarItens();
        nomes.buscarIndice(2);
    }

}


