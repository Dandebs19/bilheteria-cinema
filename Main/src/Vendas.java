public class Vendas {
    private int totalIngressos, tipoIngresso, tipoAplicado, idadeCliente, metodoPagamento;

    public double valorTotal;

    private static final double PRECO_BASE = 30.0;

    private boolean ingressoGratuito;

    double PercentualValorIngresso;


    public Vendas(int quantidade, int tipoIngresso, int idadeCliente) {
        this.totalIngressos = quantidade;
        this.tipoIngresso = tipoIngresso;
        this.idadeCliente = idadeCliente;
        this.ingressoGratuito = idadeCliente <= 5;
        this.idadeCliente = idadeCliente;
        calcularVendas();
    }
    public void calcularVendas() {
        if (ingressoGratuito == true) {
            this.tipoAplicado = 4;
            this.valorTotal = 0.0;
        } else {
            this.tipoAplicado = tipoIngresso;
            double precoUnitario = calcularPrecoUnitario();
            valorTotal = calcularPrecoUnitario() * totalIngressos;
        }
    }
    public double calcularPrecoUnitario() {
        switch (tipoIngresso) {
            case 1:
                return PRECO_BASE;
            case 2:
                return PRECO_BASE * 0.5;
            case 3:
                return PRECO_BASE * 0.7;
            default:
                return PRECO_BASE;
        }
    }
    public String getTipoIngresso() {
        switch (tipoAplicado) {
            case 1: return "Inteira";
            case 2: return "Meia";
            case 3: return "Promocional";
            case 4: return "Gratuito";
            default: return "Indefinido";
            }
        }
    public void mostrarValorTotal(){
        System.out.println("Valor total: " + valorTotal);
    }
    public void mostrarValorUnitario(){
        if (this.tipoIngresso == 1) {
            PercentualValorIngresso = 1;
        }
        else if (this.tipoIngresso == 2) {
            PercentualValorIngresso = 0.5;
        }
        else if (this.tipoIngresso == 3) {
            PercentualValorIngresso = 0.7;
        }
        System.out.printf("Valor de cada ingresso: R$%.2f\n", valorTotal);
    }
    }
