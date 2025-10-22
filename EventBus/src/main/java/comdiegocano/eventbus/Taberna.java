package comdiegocano.eventbus;

import java.util.Arrays;


import java.util.Arrays;

public class Taberna {
    public static void main(String[] args) {
        EventBus bus = new EventBus();

        SistemaPedidos pedidos = new SistemaPedidos(bus);
        Barra barra = new Barra(bus);
        Cocina cocina = new Cocina(bus);
        Banda banda = new Banda(bus);
        SistemaDeSonido sonido = new SistemaDeSonido();
        PanelLED panel = new PanelLED();
        
        //nuevo sistema agregado
        SistemaDeHumo humo = new SistemaDeHumo();

        // Suscripciones
        bus.suscribirsePedido(barra);
        bus.suscribirsePedido(cocina);
        bus.suscribirseBanda(sonido);
        bus.suscribirseBebida(panel);
        bus.suscribirseComida(panel);
        bus.suscribirseBanda(panel);
        bus.suscribirseBanda(humo); //se suscribe al evento de banda

        // Flujo de ejemplo
        pedidos.recibirPedido("Mesa 5", "pedido_123", Arrays.asList("Cerveza", "Hamburguesa"));
        banda.tocarCancion("DragonForce", "Through the Fire and Flames", 430);
    }
}
