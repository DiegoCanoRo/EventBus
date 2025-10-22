package comdiegocano.eventbus;

public class PanelLED implements EventListenerBanda, EventListenerBebida, EventListenerComida {

    @Override
    public void bebida(BebidaServidaEvent evento) {
        System.out.println("[PANEL LED] Bebida Servida en la mesa " + evento.getMesaId());
    }

    @Override
    public void banda(BandaTocandoEvent evento) {
        System.out.println("[PANEL LED] La banda " + evento.getNombreBanda() + " está tocando " + evento.getNombreCancion());

    }

    @Override
    public void comida(ComidaPreparadaEvent evento) {
        System.out.println("[PANEL LED] Comida lista del pedido " + evento.getPedidoId());
    }
}
