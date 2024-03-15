package com.antonioferreira.primeiraentrega;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data public class Livros {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Nome;
    private Long Id;
    private String Autor;
    private int Ano;
    private String Categoria;

    public Livros(String nome, String autor, int ano, String categoria) {

    }

    public Livros() {

    }
}
