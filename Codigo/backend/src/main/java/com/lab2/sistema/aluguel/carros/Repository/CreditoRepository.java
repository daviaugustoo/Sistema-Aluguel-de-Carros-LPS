package com.lab2.sistema.aluguel.carros.Repository;

import com.lab2.sistema.aluguel.carros.model.Credito;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditoRepository extends MongoRepository<Credito, String> {
}