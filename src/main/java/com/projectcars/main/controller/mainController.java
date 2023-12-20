package com.projectcars.main.controller;

import com.projectcars.main.models.Cliente;
import com.projectcars.main.models.Veiculo;
import com.projectcars.main.models.Venda;
import com.projectcars.main.services.ClienteService;
import com.projectcars.main.services.VeiculoService;
import com.projectcars.main.services.VendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;

@Controller
public class mainController {
    @Autowired
    ClienteService clienteService;
    @Autowired
    VeiculoService veiculoService;
    @Autowired
    VendaService vendaService;

    @GetMapping("/")
    public String inicio(){
        return "index";
    }

    @GetMapping("/cadastro-veiculos")
    public String cadastroFormV(Model model) {
        model.addAttribute("veiculo", new Veiculo());
        return "cadastro-veiculos";
    }

    @GetMapping("/cadastro-clientes")
    public String cadastroFormC(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cadastro-clientes";
    }

    @GetMapping("/registro-vendas")
    public String registroVendas(Model model){
        model.addAttribute("venda", new Venda());
        return "registro-vendas";
    }

    @PostMapping("/gravarCliente")
    public String processarCliente(@ModelAttribute Cliente cliente, Model model) {

            if (cliente.getId() != null) {
                clienteService.atualizarCliente(cliente.getId(), cliente);
            } else {
                clienteService.salvarCliente(cliente);
            }

        return "redirect:/lista";
    }

    @PostMapping("/gravarVeiculo")
    public String processarVeiculo(@ModelAttribute Veiculo veiculo, Model model){
        if(veiculo.getId()!=null){
            veiculoService.atualizarVeiculo(veiculo.getId(), veiculo);
        } else {
            veiculoService.salvarVeiculo(veiculo);
        }
        return "redirect:/lista";
    }


    @PostMapping("/gravarVenda")
    public String processarVenda(@ModelAttribute Venda venda, Model model){
        if (venda.getId()!=null){
            vendaService.atualizarVenda(venda.getId(), venda);
        } else {
            vendaService.salvarVenda(venda);
        }
        return "redirect:/listagem";
    }
    @GetMapping ("/lista")
    public String listarForm(Model model) {
        model.addAttribute("lista", clienteService.listarClientes());
        model.addAttribute("lista", veiculoService.listarVeiculos());
        model.addAttribute("lista", vendaService.listarVendas());

        return "lista";
    }
}