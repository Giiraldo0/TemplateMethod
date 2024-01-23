package TemplateMethod;

public abstract class Juego {

    public final void iniciarJuego(){
        System.out.println("Preparando oponentes");

    }
    public abstract void iniciandoPartida();
    public abstract void jugando();
    public abstract void finalizandoPartida();

}
