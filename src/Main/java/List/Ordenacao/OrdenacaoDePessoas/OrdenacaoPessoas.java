package Main.java.List.Ordenacao.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    private void setPessoaList(List<Pessoa> pessoaList) {
        this.pessoaList = pessoaList;
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new CompararPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {

        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();

        pessoas.adicionarPessoa("Pessoa 1", 20, 1.70);
        pessoas.adicionarPessoa("Pessoa 5", 26, 1.60);
        pessoas.adicionarPessoa("Pessoa 15", 10, 1.3);
        pessoas.adicionarPessoa("Pessoa", 20, 1.45);
        pessoas.adicionarPessoa("Pessoa 2", 60, 1);
        pessoas.adicionarPessoa("Pessoa 8", 40, 1.55);
        pessoas.adicionarPessoa("Pe", 20, 1.77);

        System.out.println(pessoas.ordenarPorIdade());

        System.out.println(pessoas.ordenarPorAltura());

    }
}
