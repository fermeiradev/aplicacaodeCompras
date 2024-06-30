import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite =input.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int opcaoEscolhida = 1;

        while (opcaoEscolhida == 1) {
            System.out.println("Digite a descrição da compra");
            String descricao = input.next();

            System.out.println("Digite o valor da compra: ");
            double valorCompra = input.nextDouble();

            Compra compra = new Compra(descricao, valorCompra);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair e 1 para continuar!");
                opcaoEscolhida = input.nextInt();
            } else {
                System.out.println("SALDO INSUFICIENTE");
                opcaoEscolhida = 0;
            }

        }
            System.out.println("***************************");
            System.out.println("COMPRAS REALIZADAS:\n");
            Collections.sort(cartao.getCompras());
            for (Compra compras: cartao.getCompras()) {
                System.out.println(compras.getDescricao() + " - " + compras.getValorCompra());
            }
            System.out.println("\n***************************");

            System.out.println("\nSaldo do cartão: R$" + cartao.getSaldo());

    }
}