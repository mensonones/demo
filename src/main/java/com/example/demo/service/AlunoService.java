package com.example.demo.service;

import com.example.demo.model.Aluno;
import com.example.demo.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno criar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Aluno buscarPorId(UUID id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public List<Aluno> buscarPorNome(String nome) {
        return alunoRepository.findByNome(nome);
    }

    public Aluno atualizar(UUID id, Aluno aluno) {
        Aluno existente = buscarPorId(id);
        if (existente == null) return null;
        existente.setNome(aluno.getNome());
        return alunoRepository.save(existente);
    }

    public void deletar(UUID id) {
        alunoRepository.deleteById(id);
    }
}
