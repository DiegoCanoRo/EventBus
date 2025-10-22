package comdiegocano.eventbus;

import java.util.ArrayList;
import java.util.List;

public class SistemaPedidos {

    private EventBus bus;
    
    public SistemaPedidos(EventBus bus){
        this.bus = bus;
    }
    
    public void recibirPedido(String mesa_id,String pedido_id,List<String> items){
        PedidoRealizadoEvent evento = new PedidoRealizadoEvent(mesa_id,pedido_id,items);
        bus.publicar(evento);
        
        System.out.println("Pedido recibido y publicado: " + items);
    }
}
