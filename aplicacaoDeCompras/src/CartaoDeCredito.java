import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteDoCartao;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
        this.saldo = limiteDoCartao;
        this.compras = new ArrayList<>();
    }

    public void setLimiteDoCartao(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancaCompra(Compra compra) {
        if(this.saldo > compra.getValorCompra()) {
            this.saldo -= compra.getValorCompra();
            this.compras.add(compra);
            return true;
        }
        return  false;
    }
}
