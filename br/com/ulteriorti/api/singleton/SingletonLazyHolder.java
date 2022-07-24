package br.com.ulteriorti.api.singleton;

/**
 * Singleton Lazy Holder

 * @author Denis Souza
 */
public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder() {
        super();

    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
