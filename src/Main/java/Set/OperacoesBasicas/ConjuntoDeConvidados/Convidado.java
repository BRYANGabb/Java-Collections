package Main.java.Set.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvidado;

    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    private void setCodigoConvidado(int codigoConvidado) {
        this.codigoConvidado = codigoConvidado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvidado == convidado.codigoConvidado;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvidado);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvidado=" + codigoConvidado +
                '}';
    }
}
