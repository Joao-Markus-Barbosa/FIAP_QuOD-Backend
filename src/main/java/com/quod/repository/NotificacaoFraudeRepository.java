package com.quod.repository;

import com.quod.model.NotificacaoFraude;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacaoFraudeRepository extends MongoRepository<NotificacaoFraude, String> {
}
