package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.TrendingMovie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TrendingMovieRepository extends MongoRepository<TrendingMovie, String> {
    Optional<TrendingMovie> findById(int id);
}
