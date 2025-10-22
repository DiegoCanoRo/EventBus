package comdiegocano.eventbus;

public class SistemaDeSonido implements EventListenerBanda {
    @Override
    public void banda(BandaTocandoEvent evento){
        System.out.println("Ajustando sonido para la canción: " + evento.getNombreCancion());
    }
}
