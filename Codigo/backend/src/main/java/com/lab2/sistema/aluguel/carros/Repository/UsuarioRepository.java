package com.lab2.sistema.aluguel.carros.Repository;

import com.lab2.sistema.aluguel.carros.Model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Long> {
}