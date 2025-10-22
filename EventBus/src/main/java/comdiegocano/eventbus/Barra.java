package comdiegocano.eventbus;


public class Barra implements EventListenerPedido{
    private EventBus bus;
    
    public Barra(EventBus bus){
        this.bus = bus;
    }
    
    @Override
    public void pedido(PedidoRealizadoEvent evento){
        for(String item : evento.getItems()){
            if(item.toLowerCase().contains("bebida") || item.toLowerCase().contains("cerveza")){
                BebidaServidaEvent bebidaEvento = new BebidaServidaEvent(evento.getMesaId(),item);
                bus.publicar(bebidaEvento);
                System.out.println("Bebida servida: " + item + " en la mesa: " + evento.getMesaId());
            }
        }
    }
}
