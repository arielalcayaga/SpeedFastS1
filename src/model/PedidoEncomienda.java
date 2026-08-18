/**
 * Clase Hija PedidoEncomienda
 */
package model;

public class PedidoEncomienda extends Pedido {
    /**
     * Atributo propio Clase PedidoEncomienda
     */
    private double pesoEncomienda;

    /**
     *
     *@param idPedido identificador pedido
     * @param direccionEntrega direccion entrega pedido
     * @param tipoPedido tipo pedido
     * @param pesoEncomienda peso encomienda
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido, double pesoEncomienda) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.pesoEncomienda = pesoEncomienda;
    }

    public double getPesoEncomienda() {
        return pesoEncomienda;
    }

    public void setPesoEncomienda(double pesoEncomienda) {
        this.pesoEncomienda = pesoEncomienda;
    }

    /**
     * Sobre escritura metodo asignarRepartidor
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Esperando encomienda...");
    }
}