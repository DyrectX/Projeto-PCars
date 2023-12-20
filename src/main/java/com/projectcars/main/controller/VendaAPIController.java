package com.projectcars.main.controller;

import com.projectcars.main.models.Venda;
import com.projectcars.main.services.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaAPIController {

    @Autowired
    private VendaService vendaService;

    @PostMapping("/adicionar")
    public ResponseEntity<Venda> addVenda(@RequestBody Venda venda) {
        var newVenda = vendaService.salvarVenda(venda);
        return new ResponseEntity<>(newVenda, HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Venda>> listarVendas() {
        List<Venda> vendas = vendaService.listarVendas();
        return new ResponseEntity<>(vendas, HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Venda> buscarVenda(@PathVariable Integer id) {
        Venda vendaEncontrada = vendaService.obterVendaPorId(id);
        return new ResponseEntity<>(vendaEncontrada, HttpStatus.OK);
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<Venda> editarVenda(@PathVariable Integer id, @RequestBody Venda venda) {
        var editarVenda = vendaService.atualizarVenda(id, venda);
        return new ResponseEntity<>(editarVenda, HttpStatus.OK);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> excluirVenda(@PathVariable Integer id) {
        vendaService.deletarVenda(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
