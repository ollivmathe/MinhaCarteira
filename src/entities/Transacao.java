package entities;

import exceptions.ValorInvalidoException;

public abstract class Transacao {
    private String descricao;
    private double valor;
    private String data;

    public Transacao(String descricao, double valor, String data) throws ValorInvalidoException {

        if (valor <= 0) {
            throw new ValorInvalidoException("O valor da transação deve ser maior que zero.");
        }

        setDescricao(descricao);
        this.valor = valor;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ser vazia.");
        }
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }
    
    public abstract void exibirDetalhes();
}
