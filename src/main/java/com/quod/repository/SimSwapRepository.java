package com.quod.repository;

import com.quod.model.RegistroSimSwap;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SimSwapRepository extends MongoRepository<RegistroSimSwap, String> {

    List<RegistroSimSwap> findByCpf(String cpf);
}

