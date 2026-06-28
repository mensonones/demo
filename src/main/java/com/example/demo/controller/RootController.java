package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RootController {

    @GetMapping("/")
    public Map<String, Object> index() {
        return Map.of(
            "application", "Demo API",
            "status", "running",
            "endpoints", Map.of(
                "criar_aluno", "POST /alunos",
                "listar_alunos", "GET /alunos",
                "buscar_aluno_por_id", "GET /alunos/{id}",
                "buscar_aluno_por_nome", "GET /alunos/nome?nome=xxx",
                "atualizar_aluno", "PUT /alunos/{id}",
                "deletar_aluno", "DELETE /alunos/{id}"
            )
        );
    }
}
