package Models.Servico;

public class ServicoPayPal implements ServicoPagamentoOnline {

    private static final double TAXA_PAGAMENTO = 0.02;
    private static final double JURO_MENSAL = 0.01;

    @Override
    public Double TaxaPagamento(double montante) {
        return montante * TAXA_PAGAMENTO;
    }

    @Override
    public Double Juros(double montante, int numeroParcela) {
        return montante * JURO_MENSAL * numeroParcela;
    }
}



