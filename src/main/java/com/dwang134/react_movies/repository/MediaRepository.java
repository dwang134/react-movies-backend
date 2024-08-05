package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.Media;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MediaRepository extends MongoRepository<Media, String> {
    List<Media> findByType(String type);
    Optional<Media> findByIdAndType(String id, String type);
    List<Media> findByTypeAndFeaturedTrue(String type);
}
