package TemplateMethod;

public class Parques extends Juego{
    @Override
    public void iniciandoPartida() {
        System.out.println("Iniciando partida de Parqués");

    }

    @Override
    public void jugando() {
        System.out.println("Jugando partida de Parqués");

    }

    @Override
    public void finalizandoPartida() {
        System.out.println("Finalizando partida de parqués");

    }
}
