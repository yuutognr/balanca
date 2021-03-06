package br.com.cdp.balanca.model.dao;

import br.com.cdp.balanca.model.entities.Veiculo;

import java.util.List;

public interface VeiculoDAO {

    Veiculo findById(int id);

    void updateTara(Veiculo veiculo);

    Veiculo findByPlaca(String placa);

    List<Veiculo> findAll();
}
