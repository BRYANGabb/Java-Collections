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

}


