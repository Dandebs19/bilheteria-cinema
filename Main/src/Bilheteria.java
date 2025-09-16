public class Bilheteria {
    int TotalIngressosVendidos = 0;
    int Inteira = 0; int Meia = 0; int Promocional = 0; int Gratuita = 0;
    double TotalValorArrecadado = 0;

    public Bilheteria(int TotalIngressosVendidos, int Inteira, int Meia, int Promocional, int Gratuita, double TotalValorArrecadado){
        this.TotalIngressosVendidos = TotalIngressosVendidos;
        this.Inteira = Inteira;
        this.Meia = Meia;
        this.Promocional = Promocional;
        this.Gratuita = Gratuita;
        this.TotalValorArrecadado = TotalValorArrecadado;
    }

    public void MostrarRelatorio(){
        System.out.println("====================Relatório====================");
        System.out.printf("Total de ingressos vendidos: %s", TotalIngressosVendidos);
        System.out.printf("\nTipos de ingressos vendidos: %s inteiras, %s meias, %s promocionais, %s gratuitas", Inteira, Meia, Promocional, Gratuita);
        System.out.printf("\nTotal do valor arrecadado: %.2f", TotalValorArrecadado);
    }
}