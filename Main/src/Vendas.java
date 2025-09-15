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
    public calcularVendas(){
        if(ingressoGratuito == true){
            

        }
    }






}