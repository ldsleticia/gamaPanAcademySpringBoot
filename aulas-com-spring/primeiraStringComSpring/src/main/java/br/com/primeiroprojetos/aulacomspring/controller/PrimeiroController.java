package br.com.primeiroprojetos.aulacomspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/expectativas")
public class PrimeiroController {

    @GetMapping
    public String expectativas(){
        return "Aprender Java <br>" +
                "Trabalhar em equipe <br>" +
                "Paciencia comigo mesma";

    }
}
