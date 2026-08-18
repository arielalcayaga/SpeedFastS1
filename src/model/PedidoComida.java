/**
 * Clase Hija PedidoComida
 */
package model;

public class PedidoComida extends Pedido {
    /**
     * Atributo propio Clase PedidoComida
     */
    private String platoComida;

    /**
     *
     * @param idPedido identificador pedido
     * @param direccionEntrega direccion entrega pedido
     * @param tipoPedido tipo pedido
     * @param platoComida plato de comida
     */
    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido, String platoComida) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.platoComida = platoComida;
    }

    public String getPlatoComida() {
        return platoComida;
    }

    public void setPlatoComida(String platoComida) {
        this.platoComida = platoComida;
    }

    /**
     * Sobre escritura metodo asignarRepartidor
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Esperando plato...");

    }
}