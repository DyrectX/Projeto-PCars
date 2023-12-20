package com.projectcars.main.controller;

import com.projectcars.main.models.Cliente;
import com.projectcars.main.models.Veiculo;
import com.projectcars.main.models.Venda;
import com.projectcars.main.services.ClienteService;
import com.projectcars.main.services.VeiculoService;
import com.projectcars.main.services.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class apiController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private VeiculoService veiculoService;

    @Autowired
    private VendaService vendaService;

    // Endpoints para Cliente

    @PostMapping("/clientes/criar")
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente) {
        var newCliente = clienteService.salvarCliente(cliente);
        return new ResponseEntity<>(newCliente, HttpStatus.CREATED);
    }

    @GetMapping("/clientes/listagem")
    public ResponseEntity<List<Cliente>> listarClientes() {
        List<Cliente> clientes = clienteService.listarClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @GetMapping("/clientes/busca/{id}")
    public ResponseEntity<Cliente> buscarCliente(@PathVariable Integer id) {
        Cliente clienteEncontrado = clienteService.obterClientePorId(id);
        return new ResponseEntity<>(clienteEncontrado, HttpStatus.OK);
    }

    @PutMapping("/clientes/atualizar/{id}")
    public ResponseEntity<Cliente> editarCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        var editarCliente = clienteService.atualizarCliente(id, cliente);
        return new ResponseEntity<>(editarCliente, HttpStatus.OK);
    }

    @DeleteMapping("/clientes/deletar/{id}")
    public ResponseEntity<Void> excluirCliente(@PathVariable Integer id) {
        clienteService.deletarCliente(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Endpoints para Veiculo

    @PostMapping("/veiculos/criar")
    public ResponseEntity<Veiculo> addVeiculo(@RequestBody Veiculo veiculo) {
        var newVeiculo = veiculoService.salvarVeiculo(veiculo);
        return new ResponseEntity<>(newVeiculo, HttpStatus.CREATED);
    }

    @GetMapping("/veiculos/listagem")
    public ResponseEntity<List<Veiculo>> listarVeiculos() {
        List<Veiculo> veiculos = veiculoService.listarVeiculos();
        return new ResponseEntity<>(veiculos, HttpStatus.OK);
    }

    @GetMapping("/veiculos/buscar/{id}")
    public ResponseEntity<Veiculo> buscarVeiculo(@PathVariable Integer id) {
        Veiculo veiculoEncontrado = veiculoService.obterVeiculoPorId(id);
        return new ResponseEntity<>(veiculoEncontrado, HttpStatus.OK);
    }

    @PutMapping("/veiculos/alterar/{id}")
    public ResponseEntity<Veiculo> editarVeiculo(@PathVariable Integer id, @RequestBody Veiculo veiculo) {
        var editarVeiculo = veiculoService.atualizarVeiculo(id, veiculo);
        return new ResponseEntity<>(editarVeiculo, HttpStatus.OK);
    }

    @DeleteMapping("/veiculos/excluir/{id}")
    public ResponseEntity<Void> excluirVeiculo(@PathVariable Integer id) {
        veiculoService.deletarVeiculo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Endpoints para Venda

    @PostMapping("/vendas/adicionar")
    public ResponseEntity<Venda> addVenda(@RequestBody Venda venda) {
        var newVenda = vendaService.salvarVenda(venda);
        return new ResponseEntity<>(newVenda, HttpStatus.CREATED);
    }

    @GetMapping("/vendas/listar")
    public ResponseEntity<List<Venda>> listarVendas() {
        List<Venda> vendas = vendaService.listarVendas();
        return new ResponseEntity<>(vendas, HttpStatus.OK);
    }

    @GetMapping("/vendas/buscar/{id}")
    public ResponseEntity<Venda> buscarVenda(@PathVariable Integer id) {
        Venda vendaEncontrada = vendaService.obterVendaPorId(id);
        return new ResponseEntity<>(vendaEncontrada, HttpStatus.OK);
    }

    @PutMapping("/vendas/alterar/{id}")
    public ResponseEntity<Venda> editarVenda(@PathVariable Integer id, @RequestBody Venda venda) {
        var editarVenda = vendaService.atualizarVenda(id, venda);
        return new ResponseEntity<>(editarVenda, HttpStatus.OK);
    }

    @DeleteMapping("/vendas/excluir/{id}")
    public ResponseEntity<Void> excluirVenda(@PathVariable Integer id) {
        vendaService.deletarVenda(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
