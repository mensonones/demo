package com.example.demo.pessoa;

import java.util.Objects;

public class Pessoa {

    private int id;
    private String nome;

    public Pessoa(){}

    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) &&
                Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nome);
    }
}
