package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.TrendingMovie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrendingMovieRepository extends MongoRepository<TrendingMovie, String> {}
