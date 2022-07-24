package br.com.ulteriorti.api.singleton;

/**
 * Singleton preguiçoso
 *
 * @author Denis Souza
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();

    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
