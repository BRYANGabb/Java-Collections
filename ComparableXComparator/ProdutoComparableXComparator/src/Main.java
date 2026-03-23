import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Produto> p = new ArrayList<>();

        p.add(new Produto("Sabao", 2.00f));
        p.add(new Produto("Arroz", 15.46f));
        p.add(new Produto("Sal", 5.78f));
        p.add(new Produto("Sal", 4.78f));

        System.out.println("Produtos: ");
        /*Collections.sort(p);
        for (Produto produto : p) {
            System.out.println(produto.toString());
        }*/

        /*Collections.sort(p, new OrdenarNome());
        for (Produto produto : p){
            System.out.println(produto.toString());
        }*/

        Collections.sort(p, new OrdenarNomePreco());
        for (Produto produto : p){
            System.out.println(produto.toString());
        }
    }
}