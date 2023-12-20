package com.projectcars.main.services;

import com.projectcars.main.models.Venda;
import com.projectcars.main.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    public Venda salvarVenda(Venda venda) {
        venda.setId(null);
        vendaRepository.save(venda);
        return venda;
    }

    public List<Venda> listarVendas() {
        return vendaRepository.findAll();
    }

    public Venda obterVendaPorId(Integer id) {
        return vendaRepository.findById(id).orElseThrow();
    }

    public Venda atualizarVenda(Integer id, Venda venda) {
        Venda vendaExistente = obterVendaPorId(id);
        vendaExistente.setNomeCliente(venda.getNomeCliente());
        vendaExistente.setVeiculoVendido(venda.getVeiculoVendido());
        vendaExistente.setValor(venda.getValor());
        vendaExistente.setParcelas(venda.getParcelas());
        vendaRepository.save(vendaExistente);
        return vendaExistente;
    }

    public void deletarVenda(Integer id) {
        Venda vendaEncontrada = obterVendaPorId(id);
        vendaRepository.deleteById(vendaEncontrada.getId());
    }
}