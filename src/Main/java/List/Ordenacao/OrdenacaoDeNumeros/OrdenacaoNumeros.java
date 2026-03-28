package Main.java.List.Ordenacao.OrdenacaoDeNumeros;

import Main.java.List.Ordenacao.OrdenacaoDePessoas.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    List<Integer> numerosInt;

    public OrdenacaoNumeros() {
        this.numerosInt = new ArrayList<>();
    }

    public List<Integer> getNumerosInt() {
        return numerosInt;
    }

    private void setNumerosInt(List<Integer> numerosInt) {
        this.numerosInt = numerosInt;
    }

    public void adicionarNumero(int numero){
        this.numerosInt.add(numero);
    }

    public List<Integer> ListAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(numerosInt);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ListDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(numerosInt);
        Collections.sort(numerosDescendente, Collections.reverseOrder());
        return numerosDescendente;
    }


    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(15);

        System.out.println(numeros.ListAscendente());

        System.out.println(numeros.ListDescendente());

    }
}
