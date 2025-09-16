import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================BILHETERIA DE CINEMA====================");

        while (true) {
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

            if (AtenderProximoCliente.equals("N")) {
                break;
            }
        }
    }
}