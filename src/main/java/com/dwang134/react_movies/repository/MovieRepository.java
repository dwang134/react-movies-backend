package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.MoviesNowPlaying;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends MongoRepository<MoviesNowPlaying, String> {
    Optional<MoviesNowPlaying> findById(int id);

    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<MoviesNowPlaying> findByTitleRegexIgnoreCase(String regex);
}
