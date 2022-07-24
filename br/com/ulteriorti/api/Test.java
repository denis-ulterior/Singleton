package br.com.ulteriorti.api;

import br.com.ulteriorti.api.facade.Facade;
import br.com.ulteriorti.api.singleton.SingletonEager;
import br.com.ulteriorti.api.singleton.SingletonLazy;
import br.com.ulteriorti.api.singleton.SingletonLazyHolder;
import br.com.ulteriorti.api.strategy.*;

public class Test {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy=SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();

        Facade facade = new Facade();
        facade.migraCliente("Denis","120000");
    }
}
