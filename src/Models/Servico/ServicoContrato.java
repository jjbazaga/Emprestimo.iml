package Models.Servico;
import Models.Entidade.Contrato;
import Models.Entidade.Parcela;
import java.time.LocalDate;

public class ServicoContrato {
    private ServicoPagamentoOnline servicoPagamentoOnline;
    public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }
    public void pocessoContrato(Contrato contrato, int numeroMeses){
        double parcelaBasica = contrato.getValorContrato() / numeroMeses;
        for(int i = 1; i <= numeroMeses; i++){
            LocalDate vencimento = contrato.getData().plusMonths(i);
            double juros = servicoPagamentoOnline.Juros(parcelaBasica, i);
            double taxa = servicoPagamentoOnline.TaxaPagamento(parcelaBasica + juros);
            double valorCheio = parcelaBasica + juros + taxa;

            contrato.getValorPrestacao().add((new Parcela(vencimento, valorCheio)));
        }
    }
}
