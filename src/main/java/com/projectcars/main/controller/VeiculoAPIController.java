package com.projectcars.main.controller;

import com.projectcars.main.models.Veiculo;
import com.projectcars.main.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoAPIController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping("/adicionar")
    public ResponseEntity<Veiculo> addVeiculo(@RequestBody Veiculo veiculo) {
        var newVeiculo = veiculoService.salvarVeiculo(veiculo);
        return new ResponseEntity<>(newVeiculo, HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Veiculo>> listarVeiculos() {
        List<Veiculo> veiculos = veiculoService.listarVeiculos();
        return new ResponseEntity<>(veiculos, HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Veiculo> buscarVeiculo(@PathVariable Integer id) {
        Veiculo veiculoEncontrado = veiculoService.obterVeiculoPorId(id);
        return new ResponseEntity<>(veiculoEncontrado, HttpStatus.OK);
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<Veiculo> editarVeiculo(@PathVariable Integer id, @RequestBody Veiculo veiculo) {
        var editarVeiculo = veiculoService.atualizarVeiculo(id, veiculo);
        return new ResponseEntity<>(editarVeiculo, HttpStatus.OK);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> excluirVeiculo(@PathVariable Integer id) {
        veiculoService.deletarVeiculo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

