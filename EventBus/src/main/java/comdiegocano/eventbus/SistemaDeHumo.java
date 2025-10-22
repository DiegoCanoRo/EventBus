package comdiegocano.eventbus;

public class SistemaDeHumo implements EventListenerBanda {

    @Override
    public void banda(BandaTocandoEvent evento) {
        if (evento.getNombreCancion().equalsIgnoreCase("Through the Fire and Flames")) {
            System.out.println(" Sistema de humo activado para: " + evento.getNombreCancion());
        }
    }
}
