package Models.Entidade;
import java.time.LocalDate;

public class Parcela {
    private LocalDate data;
    private Double valorParcela;

    public Parcela(){
    }
    public Parcela(LocalDate data, Double valorParcela) {
        this.data = data;
        this.valorParcela = valorParcela;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        return "Prestacao{" +
                "data=" + data +
                ", montante=" + String.format("%.2f", valorParcela) +
                '}';
    }
}
