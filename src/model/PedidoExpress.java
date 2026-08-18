/**
 * Clase Hija PedidoExpress
 */
package model;

public class PedidoExpress extends Pedido {
    /**
     * Atributo propio Clase PedidoExpress
     */
    private String tipoUrgenciaPedido;

    /**
     *
     * @param idPedido identificador pedido
     * @param direccionEntrega direccion entrega pedido
     * @param tipoPedido tipo pedido
     * @param tipoUrgenciaPedido tipo urgencia pedido
     */
    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido, String tipoUrgenciaPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.tipoUrgenciaPedido = tipoUrgenciaPedido;
    }

    public String getTipoUrgenciaPedido() {
        return tipoUrgenciaPedido;
    }

    public void setTipoUrgenciaPedido(String tipoUrgenciaPedido) {
        this.tipoUrgenciaPedido = tipoUrgenciaPedido;
    }

    /**
     * Sobre escritura metodo asignarRepartidor
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando Urgencia Pedido Express...");
    }
}