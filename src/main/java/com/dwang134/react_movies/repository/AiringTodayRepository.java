package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.AiringToday;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AiringTodayRepository extends MongoRepository<AiringToday, String> {
    Optional<AiringToday> findById(int id);
}
