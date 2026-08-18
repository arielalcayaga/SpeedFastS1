package app;

import model.*;

public class Main {
    public static void main(String[] args) {

      Pedido pedido1 = new PedidoComida(001,
               "Los Alerces 1234", "Comida",
               "Pizza");

        System.out.println("=================================");
      pedido1.asignarRepartidor();
        System.out.println("---------------------------------");
      pedido1.asignarRepartidor("Juan Soto");
        System.out.println("=================================");

        Pedido pedido2 = new PedidoEncomienda(002,
                "Los Olmos 5678", "Encomienda",
                1.2);

        pedido2.asignarRepartidor();
        System.out.println("---------------------------------");
        pedido2.asignarRepartidor("Lucía Vera");
        System.out.println("=================================");

        Pedido pedido3 = new PedidoExpress(003,
                "Los Pinos 9123", "Express",
                "Urgente");

        pedido3.asignarRepartidor();
        System.out.println("---------------------------------");
        pedido3.asignarRepartidor("Pablo Lopéz");
        System.out.println("=================================");
    }
}