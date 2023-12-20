package com.projectcars.main.controller;

import com.projectcars.main.models.Cliente;
import com.projectcars.main.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteAPIController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/adicionar")
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente) {
        var newCliente = clienteService.salvarCliente(cliente);
        return new ResponseEntity<>(newCliente, HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listarClientesAPI() {
        List<Cliente> clientes = clienteService.listarClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Cliente> buscarCliente(@PathVariable Integer id) {
        Cliente clienteEncontrado = clienteService.obterClientePorId(id);
        return new ResponseEntity<>(clienteEncontrado, HttpStatus.OK);
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<Cliente> editarCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        var editarCliente = clienteService.atualizarCliente(id, cliente);
        return new ResponseEntity<>(editarCliente, HttpStatus.OK);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> excluirCliente(@PathVariable Integer id) {
        clienteService.deletarCliente(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

