import java.util.ArrayList;
import java.util.List;

public class Caixa <T>{
    private T item;

    private List <T> itens;

    public Caixa() {
        this.itens = new ArrayList<>();
    }

    public void guardarItem(T item){
        this.itens.add(item);
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void revelar(){
        for (T i : itens){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Caixa <Integer> caixaInt= new Caixa<>();
        Caixa <String> caixaString= new Caixa<>();
        caixaInt.guardarItem(20);
        caixaString.guardarItem("Bryan");
        caixaInt.revelar();
        caixaString.revelar();
    }
}
