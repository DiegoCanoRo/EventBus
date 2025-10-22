package comdiegocano.eventbus;

import java.util.ArrayList;
import java.util.List;

public class PedidoRealizadoEvent {
    private String mesa_id;
    private String pedido_id;
    private List<String> items;
    
    public PedidoRealizadoEvent(String mesa_id, String pedido_id, List<String> items){
        this.mesa_id = mesa_id;
        this.pedido_id = pedido_id;
        this.items = items;
    }
    
    public String getMesaId(){
        return mesa_id;
    }
    
    public String getPedidoId(){
        return pedido_id;
    }        
    
    public List<String> getItems(){
        return items;
    }
}
