package com.lab2.sistema.aluguel.carros.Repository;

import com.lab2.sistema.aluguel.carros.Model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}