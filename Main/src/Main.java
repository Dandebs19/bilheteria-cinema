import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================BILHETERIA DE CINEMA====================");

        System.out.println("Quantidade de ingressos: ");
        int TotalIngressos = input.nextInt();

        System.out.println("Tipo de ingresso desejado: \n1 - Inteira (R$30,00) \n2 - Meia (50% Desconto) \n3 - Promocional (30% Desconto)\n4 - Gratuito (até 5 anos)");
        int TipoIngressos = input.nextInt();

        Bilheteria bilheteria = new Bilheteria(TotalIngressos, TipoIngressos);

        System.out.printf("Ingresso comprados: %d\n", TotalIngressos);
        bilheteria.MostrarValorCadaIngresso();
        bilheteria.MostrarValorTotal();
    }
}