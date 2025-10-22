package comdiegocano.eventbus;

import java.util.ArrayList;
import java.util.List;

public class EventBus {

    private List<EventListenerPedido> suscriptoresPedido;
    private List<EventListenerBebida> suscriptoresBebida;
    private List<EventListenerBanda> suscriptoresBanda;
    private List<EventListenerComida> suscriptoresComida;
    
     public EventBus() {
        suscriptoresPedido = new ArrayList<>();
        suscriptoresBebida = new ArrayList<>();
        suscriptoresBanda = new ArrayList<>();
        suscriptoresComida = new ArrayList<>();
    }
    //suscribirse
    public void suscribirsePedido(EventListenerPedido listener) {
        suscriptoresPedido.add(listener);
    }

    public void suscribirseBebida(EventListenerBebida listener) {
        suscriptoresBebida.add(listener);
    }

    public void suscribirseBanda(EventListenerBanda listener) {
        suscriptoresBanda.add(listener);
    }

    public void suscribirseComida(EventListenerComida listener) {
        suscriptoresComida.add(listener);
    }
    
    //desuscribirse
    
    
    //publicar eventos
     public void publicar(PedidoRealizadoEvent evento) {
        for (EventListenerPedido listener : suscriptoresPedido) {
            listener.pedido(evento);
        }
    }

    public void publicar(BebidaServidaEvent evento) {
        for (EventListenerBebida listener : suscriptoresBebida) {
            listener.bebida(evento);
        }
    }

    public void publicar(ComidaPreparadaEvent evento) {
        for (EventListenerComida listener : suscriptoresComida) {
            listener.comida(evento);
        }
    }

    public void publicar(BandaTocandoEvent evento) {
        for (EventListenerBanda listener : suscriptoresBanda) {
            listener.banda(evento);
        }
    }
}
