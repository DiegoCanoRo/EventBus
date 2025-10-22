package comdiegocano.eventbus;


public class Cocina implements EventListenerPedido{
    private EventBus bus;
    
    public Cocina(EventBus bus){
        this.bus = bus;
    }
    
    @Override
    public void pedido(PedidoRealizadoEvent evento){
        for(String item : evento.getItems()){
            if(item.toLowerCase().contains("Hamburgesa") || item.toLowerCase().contains("Pizza")){
                ComidaPreparadaEvent comidaEvento = new ComidaPreparadaEvent(evento.getPedidoId(),item);
                bus.publicar(comidaEvento);
                System.out.println("Comida preparada " + item + " del pedido: " + evento.getPedidoId());
            }
        }
    }
}
