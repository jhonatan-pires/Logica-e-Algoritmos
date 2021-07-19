package Encapsulamento;

public class DadosPedidosFactory {
    Double codigo;
    Double subtotal;
    Double desconto;
    double total;

    public double getTotal() {
        return (this.subtotal - this.desconto);
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Double getCodigo() {
        return codigo;
    }

    public void setCodigo(Double codigo) {
        this.codigo = codigo;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}