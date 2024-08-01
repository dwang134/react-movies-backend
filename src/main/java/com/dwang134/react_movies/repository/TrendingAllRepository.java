package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.TrendingAll;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TrendingAllRepository extends MongoRepository<TrendingAll, String> {
    Optional<TrendingAll> findById(int id);
}
