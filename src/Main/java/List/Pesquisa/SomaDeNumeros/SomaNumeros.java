package Main.java.List.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List <Integer> numerosInt;

    public SomaNumeros() {
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

    public int calcularSoma(){
        int soma = 0;
        for (Integer n : numerosInt){
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!this.numerosInt.isEmpty()){
            for (Integer n : numerosInt){
                if (n >= maiorNumero){
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!this.numerosInt.isEmpty()){
            for (Integer n : numerosInt){
                if (n <= menorNumero){
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return this.numerosInt;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);

        System.out.println(somaNumeros.exibirNumeros());

        System.out.println(somaNumeros.calcularSoma());

        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}
