package com.example.demo.controller;

import com.example.demo.model.Aluno;
import com.example.demo.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        return alunoService.criar(aluno);
    }

    @GetMapping
    public List<Aluno> listarTodos() {
        return alunoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable UUID id) {
        return alunoService.buscarPorId(id);
    }

    @GetMapping("/nome")
    public List<Aluno> buscarPorNome(@RequestParam String nome) {
        return alunoService.buscarPorNome(nome);
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable UUID id, @RequestBody Aluno aluno) {
        return alunoService.atualizar(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id) {
        alunoService.deletar(id);
    }
}
