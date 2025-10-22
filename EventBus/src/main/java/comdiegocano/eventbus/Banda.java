package comdiegocano.eventbus;


public class Banda {
    private EventBus bus;
    
    public Banda(EventBus bus){
        this.bus = bus;
    }
    
    public void tocarCancion(String nombreBanda,String nombreCancion, int duracion){
        BandaTocandoEvent bandaEvento = new BandaTocandoEvent(nombreBanda,nombreCancion,duracion);
        bus.publicar(bandaEvento);
        
        System.out.println("La banda: " + nombreBanda + " esta tocando la canción: " + nombreCancion);
    }
}
