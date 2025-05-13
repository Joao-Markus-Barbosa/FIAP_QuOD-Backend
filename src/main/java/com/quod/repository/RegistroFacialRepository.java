package com.quod.repository;

import com.quod.model.RegistroValidacaoFacial;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistroFacialRepository extends MongoRepository<RegistroValidacaoFacial, String> {

    List<RegistroValidacaoFacial> findByCpf(String cpf);
}
