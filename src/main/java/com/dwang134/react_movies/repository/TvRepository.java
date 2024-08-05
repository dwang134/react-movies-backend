package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.TvAiringToday;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TvRepository extends MongoRepository<TvAiringToday, String> {
    Optional<TvAiringToday> findById(int id);

    @Query("{ 'name': { $regex: ?0, $options: 'i' } }")
    List<TvAiringToday> findByTitleRegexIgnoreCase(String name);
}
