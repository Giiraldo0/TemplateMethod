package TemplateMethod;

public class Main {
    public static void main(String[] args) {

        Ajedrez ajedrez = new Ajedrez();
        Parques parques = new Parques();


        ajedrez.iniciarJuego();
        System.out.println("**************");
        ajedrez.iniciandoPartida();
        ajedrez.jugando();
        ajedrez.finalizandoPartida();
        System.out.println("----------------------");
        parques.iniciarJuego();
        System.out.println("**************");
        parques.iniciarJuego();
        parques.iniciandoPartida();
        parques.jugando();
        parques.finalizandoPartida();


    }
}