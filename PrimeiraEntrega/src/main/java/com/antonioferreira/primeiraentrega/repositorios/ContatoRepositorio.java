package com.antonioferreira.primeiraentrega.repositorios;

import com.antonioferreira.primeiraentrega.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepositorio extends JpaRepository <Livros,Long> {
}
