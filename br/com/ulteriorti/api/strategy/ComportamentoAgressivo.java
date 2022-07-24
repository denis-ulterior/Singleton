package br.com.ulteriorti.api.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo agressivamente");
    }
}
