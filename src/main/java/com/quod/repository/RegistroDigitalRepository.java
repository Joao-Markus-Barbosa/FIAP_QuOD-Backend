package com.quod.repository;

import com.quod.model.RegistroValidacaoDigital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistroDigitalRepository extends MongoRepository<RegistroValidacaoDigital, String> {

    List<RegistroValidacaoDigital> findByCpf(String cpf);
}

