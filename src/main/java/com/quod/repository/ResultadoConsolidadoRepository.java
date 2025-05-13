package com.quod.repository;

import com.quod.model.ResultadoConsolidado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResultadoConsolidadoRepository extends MongoRepository<ResultadoConsolidado, String> {
    Optional<ResultadoConsolidado> findByCpf(String cpf);
}
