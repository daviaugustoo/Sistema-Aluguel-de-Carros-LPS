package com.lab2.sistema.aluguel.carros.Repository;

import com.lab2.sistema.aluguel.carros.Model.Agente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenteRepository extends MongoRepository<Agente, Long> {
}