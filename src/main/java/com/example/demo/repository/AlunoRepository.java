package com.example.demo.repository;

import com.example.demo.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AlunoRepository extends JpaRepository<Aluno, UUID> {

    List<Aluno> findByNome(String nome);
}
