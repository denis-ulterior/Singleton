package br.com.ulteriorti.api.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo defensivamente");
    }
}
