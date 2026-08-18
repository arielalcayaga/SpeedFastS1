/**
 * Clase Padre Pedido
 */
package model;

public class Pedido {
    /**
     * Atributos clase Pedido
     */
    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    /**
     *
     * @param idPedido identificador pedido
     * @param direccionEntrega direccion entrega pedido
     * @param tipoPedido tipo pedido
     */
    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    /**
     * Metodo asignarRepartidor básico
     */
     public void asignarRepartidor() {
        System.out.println("Asignando repartidor...");
    }
    /**
     * Metodo asignarRepartidor con parametro nombreRepartidor
     */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Asignando repartidor...");
        System.out.println("Nombre Repartidor: " +nombreRepartidor);
    }
}
