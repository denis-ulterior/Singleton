package subsistema.cep;

import br.com.ulteriorti.api.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();

    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Taubatexas";
    }
    public String recuperarEstado(String cep){
        return "SP";
    }
}
