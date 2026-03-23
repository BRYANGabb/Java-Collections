//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caixa <Integer> caixaInt= new Caixa<>();

        Caixa <String> caixaString= new Caixa<>();

        caixaInt.guardarItem(20);

        caixaString.guardarItem("Bryan");

        caixaInt.revelar();

        caixaString.revelar();
    }
}