package Models.Entidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Integer numeroContrato;
    private LocalDate data;
    private Double valorContrato;
    private List<Parcela> valorPrestacao = new ArrayList<>();

    public Contrato() {
    }
    public Contrato(Integer numeroContrato, LocalDate data, Double valorContrato) {
        this.numeroContrato = numeroContrato;
        this.data = data;
        this.valorContrato = valorContrato;
    }

    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public List<Parcela> getValorPrestacao() {
        return valorPrestacao;
    }
}
