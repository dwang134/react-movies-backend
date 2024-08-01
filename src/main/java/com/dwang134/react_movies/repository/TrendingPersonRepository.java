package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.TrendingPeople;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TrendingPersonRepository extends MongoRepository<TrendingPeople, String> {
    Optional<TrendingPeople> findByPersonId(int personId);
}
