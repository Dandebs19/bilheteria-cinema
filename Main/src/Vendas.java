public class Vendas {
    private int quantidade, tipoIngresso, tipoAplicado, idadeCliente, metodoPagamento;

    private double valorTotal;

    private static final double PRECO_BASE = 30.0;

    private boolean ingressoGratuito;

    public Vendas(int quantidade, int tipoIngresso, int idadeCliente) {
        this.quantidade = quantidade;
        this.tipoIngresso = tipoIngresso;
        this.idadeCliente = idadeCliente;
        this.ingressoGratuito = idadeCliente <= 5;
        calcularVendas();
    }
    public void calcularVendas() {
        if (ingressoGratuito == true) {
            this.tipoAplicado = 4;
            this.valorTotal = 0.0;
        } else {
            this.tipoAplicado = tipoIngresso;
            double precoUnitario = calcularPrecoUnitario();
            valorTotal = calcularPrecoUnitario() * quantidade;
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


    }
