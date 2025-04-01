package com.lab2.sistema.aluguel.carros.Repository;

import com.lab2.sistema.aluguel.carros.model.Contrato;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends MongoRepository<Contrato, String> {
}