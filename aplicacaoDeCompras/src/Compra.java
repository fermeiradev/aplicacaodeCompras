public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valorCompra;

    public Compra(String descricao, double valorCompra) {
        this.descricao = descricao;
        this.valorCompra = valorCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    @Override
    public String toString() {
        return "Compra: " + '\'' +
                "descricao = " + descricao + '\'' +
                ", valor = " + valorCompra;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorCompra).compareTo(Double.valueOf(outraCompra.valorCompra));
    }
}
