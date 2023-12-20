package com.projectcars.main.services;

import com.projectcars.main.models.Cliente;
import com.projectcars.main.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(Cliente cliente) {
        cliente.setId(null);
        clienteRepository.save(cliente);
        return cliente;
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente obterClientePorId(Integer id) {
        return clienteRepository.findById(id).orElseThrow();
    }

    public Cliente atualizarCliente(Integer id, Cliente cliente) {
        Cliente clienteExistente = obterClientePorId(id);
        clienteExistente.setNome(cliente.getNome());
        clienteExistente.setCpf(cliente.getCpf());
        clienteExistente.setCnh(cliente.getCnh());
        clienteExistente.setTelefone(cliente.getTelefone());
        clienteRepository.save(clienteExistente);
        return clienteExistente;
    }

    public void deletarCliente(Integer id) {
        Cliente clienteEncontrado = obterClientePorId(id);
        clienteRepository.deleteById(clienteEncontrado.getId());
    }
}