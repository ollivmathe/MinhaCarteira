import Entities.Despesa;
import Entities.Receita;
import Entities.Transacao;
import Entities.Tributavel;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    public static void main(String[] args) throws Exception {
        List<Transacao> transacoes = new ArrayList<>();
        try {
            Despesa contaDeLuz = new Despesa("Conta de Luz", 150.00, "25/08/2026");
            Receita salarioMensal = new Receita("Salário Mensal", 5000.00, "25/08/2026");
            Despesa supermercado = new Despesa("Supermercado", 600.00, "25/08/2026");
            Despesa internet = new Despesa("Internet", 99.90, "02/09/2026");
            //Despesa transacaoInvalida = new Despesa("Multa", -100, "10/02/2026");

            transacoes.add(contaDeLuz);
            transacoes.add(salarioMensal);
            transacoes.add(supermercado);
            transacoes.add(internet);

            for (Transacao transacao : transacoes) {
            transacao.exibirDetalhes();
            if (transacao instanceof Tributavel) {
                System.out.printf("Imposto Calculado: %.2f\n", ((Tributavel) transacao).calcularImposto());
            }

            System.out.println();
        }

        } catch (Exception e) {
            System.out.printf("Erro: %s\n", e.getMessage());
        }
    }
}