package br.com.ulteriorti.api.facade;

import subsistema.cep.CepApi;
import subsistema.crm.CrmService;

public class Facade {
    public void migraCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);

    }
}
