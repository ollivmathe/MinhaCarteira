package Entities;

public class Receita extends Transacao implements Tributavel {

    public Receita(String descricao, double valor, String data) {
        super(descricao, valor, data);
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.1;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Descrição: %s\nValor: +%.2f\nData: %s\n", getDescricao(), getValor(), getData());
    }
}
