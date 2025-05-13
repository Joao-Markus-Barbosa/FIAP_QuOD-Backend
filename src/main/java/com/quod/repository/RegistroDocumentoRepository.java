package com.quod.repository;

import com.quod.model.RegistroValidacaoDocumento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistroDocumentoRepository extends MongoRepository<RegistroValidacaoDocumento, String> {

    List<RegistroValidacaoDocumento> findByCpf(String cpf);
}

