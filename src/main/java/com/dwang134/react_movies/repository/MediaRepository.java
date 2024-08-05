package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.Media;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MediaRepository extends MongoRepository<Media, String> {
}
