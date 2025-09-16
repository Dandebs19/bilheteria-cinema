import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int TotalIngressosVendidos = 0;
        int Inteira = 0;
        int Meia = 0;
        int Promocional = 0;
        int Gratuita = 0;
        double TotalValorArrecadado = 0;

        while (true) {
            System.out.println("====================BILHETERIA DE CINEMA====================");

            System.out.println("Quantidade de ingressos: ");
            int totalIngressos = input.nextInt();
            input.nextLine();
            System.out.println("Tipo de ingresso desejado: \n1 - Inteira (R$30,00) \n2 - Meia (50% Desconto) \n3 - Promocional (30% Desconto)\n4 - Gratuito (até 5 anos de idade)");
            int tipoIngresso = input.nextInt();
            input.nextLine();
            System.out.println("Idade: ");
            int idadeCliente = input.nextInt();
            input.nextLine();
            Vendas vendaIngressos = new Vendas(totalIngressos, tipoIngresso, idadeCliente);

            System.out.printf("Ingresso comprados: %d\n", totalIngressos);
            vendaIngressos.mostrarValorUnitario();
            vendaIngressos.mostrarValorTotal();

            System.out.println("Atender próximo cliente? (S/N)");
            String AtenderProximoCliente = input.next().toUpperCase();

            TotalIngressosVendidos += totalIngressos;
            TotalValorArrecadado += vendaIngressos.valorTotal;

            if (idadeCliente <= 5){
                Gratuita += totalIngressos;
            }
            else {
                if (tipoIngresso == 1){
                    Inteira += totalIngressos;
                }
                else if (tipoIngresso == 2){
                    Meia += totalIngressos;
                }
                else if (tipoIngresso == 3){
                    Promocional += totalIngressos;
                }
            }

            Bilheteria relatorioBilheteria = new Bilheteria(TotalIngressosVendidos, Inteira, Meia, Promocional, Gratuita, TotalValorArrecadado);

            if (AtenderProximoCliente.equals("N")) {
                relatorioBilheteria.MostrarRelatorio();
                break;
            }
        }
    }
}