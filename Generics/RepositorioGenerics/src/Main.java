import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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