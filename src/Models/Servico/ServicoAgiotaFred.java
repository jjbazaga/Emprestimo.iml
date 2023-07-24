package Models.Servico;

public class ServicoAgiotaFred implements ServicoPagamentoOnline{
    private static final double TAXA_PAGAMENTO = 0.50;
    private static final double JURO_MENSAL = 0.20;

    @Override
    public Double TaxaPagamento(double montante) {
        return montante * TAXA_PAGAMENTO;
    }

    @Override
    public Double Juros(double montante, int numeroParcela) {
        return montante * JURO_MENSAL * numeroParcela;
    }
}
