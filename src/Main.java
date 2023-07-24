import Models.Entidade.Contrato;
import Models.Entidade.Parcela;
import Models.Servico.ServicoAgiotaFred;
import Models.Servico.ServicoContrato;
import Models.Servico.ServicoPagamentoOnline;
import Models.Servico.ServicoPayPal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), dtf);
        System.out.print("Valor do contrato: ");
        Double valorContrato = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorContrato);

        System.out.print("Entre com o número de parcelas: ");
        int numeroParcelas = sc.nextInt();

        ServicoContrato servicoContrato = new ServicoContrato(new ServicoPayPal());
        servicoContrato.pocessoContrato(contrato, numeroParcelas);

        System.out.println();
        System.out.println("Parcelas:");
        for(Parcela obj: contrato.getValorPrestacao()){
            System.out.println(obj);
        }
        sc.close();
    }
}