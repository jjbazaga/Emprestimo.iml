package Models.Servico;

public interface ServicoPagamentoOnline {
    Double TaxaPagamento(double quantia);
    Double Juros(double quantia, int meses);

}
