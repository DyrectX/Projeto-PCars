package com.projectcars.main.controller;

import com.projectcars.main.models.Cliente;
import com.projectcars.main.models.Veiculo;
import com.projectcars.main.models.Venda;
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

    @GetMapping("/")
    public String inicio(){
        return "index";
    }
}
