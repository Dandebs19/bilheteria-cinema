public class Bilheteria {
    int TotalIngressos;
    int TipoIngressos;
    double ValorCadaIngresso;
    double PercentualValorIngresso;
    double ValorTotal;

    public Bilheteria(int TotalIngressos, int TipoIngressos) {
        this.TotalIngressos = TotalIngressos;
        this.TipoIngressos = TipoIngressos;
        this.ValorCadaIngresso = 30;
    }

    public void MostrarValorCadaIngresso() {
        if (this.TipoIngressos == 1) {
            PercentualValorIngresso = 1;
        }
        else if (this.TipoIngressos == 2) {
            PercentualValorIngresso = 0.5;
        }
        else if (this.TipoIngressos == 3) {
            PercentualValorIngresso = 0.7;
        }
        System.out.printf("Valor de cada ingresso: R$%.2f\n", ValorCadaIngresso*PercentualValorIngresso);
    }

    public void MostrarValorTotal(){
        ValorTotal = TotalIngressos*(ValorCadaIngresso*PercentualValorIngresso);
        System.out.printf("Valor total da compra: %.2f\n", ValorTotal);
    }
}