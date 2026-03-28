package Main.java.List.Ordenacao.OrdenacaoDePessoas;

import java.util.Comparator;

public class Pessoa implements Comparable <Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return Integer.compare(this.idade, outraPessoa.getIdade());
    }

}

class CompararPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }
}

