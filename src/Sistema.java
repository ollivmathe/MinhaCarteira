import Entities.Despesa;
import Entities.Receita;
import Entities.Transacao;
import Entities.Tributavel;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    public static void main(String[] args) throws Exception {
        List<Transacao> transacoes = new ArrayList<>();
        Despesa contaDeLuz = new Despesa("Conta de Luz", 150.00, "25/08/2026");
        Receita salarioMensal = new Receita("Salário Mensal", 5000.00, "25/08/2026");
        Despesa supermercado = new Despesa("Supermercado", 600.00, "25/08/2026");

        transacoes.add(contaDeLuz);
        transacoes.add(salarioMensal);
        transacoes.add(supermercado);

        for (Transacao transacao : transacoes) {
            transacao.exibirDetalhes();
            if (transacao instanceof Tributavel) {
                System.out.printf("Imposto Calculado: %.2f\n", ((Tributavel) transacao).calcularImposto());
            }
            System.out.println();
        }
    }
}