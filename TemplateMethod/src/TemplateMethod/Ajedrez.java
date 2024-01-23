package TemplateMethod;

public class Ajedrez extends Juego{
    @Override
    public void iniciandoPartida() {
        System.out.println("Iniciando partida de Ajedrez");

    }

    @Override
    public void jugando() {
        System.out.println("Jugando partida de Ajedrez");

    }

    @Override
    public void finalizandoPartida() {
        System.out.println("Finalizando partida de Ajedrez");

    }
}
