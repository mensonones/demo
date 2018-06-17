package com.example.demo.pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PessoaController {

    @GetMapping(produces = "application/json; charset=UTF-8")
    public Pessoa addPessoa(){
        final Pessoa pessoa = new Pessoa();
        pessoa.setId(01);
        pessoa.setNome("Pessoa Teste");
        return pessoa;
    }
}
