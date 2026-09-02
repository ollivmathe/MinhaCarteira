package Entities;

import Exceptions.ValorInvalidoException;

public class Despesa extends Transacao {
    
    public Despesa(String descricao, double valor, String data) throws ValorInvalidoException {
        super(descricao, valor, data);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Descrição: %s\nValor: -%.2f\nData: %s\n", getDescricao(), getValor(), getData());
    }
}
