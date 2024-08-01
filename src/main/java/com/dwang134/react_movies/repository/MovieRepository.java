package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.MoviesNowPlaying;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<MoviesNowPlaying, String> {
    Optional<MoviesNowPlaying> findById(int id);
}
