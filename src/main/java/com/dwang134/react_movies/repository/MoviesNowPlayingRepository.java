package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.MoviesNowPlaying;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.dwang134.react_movies.repository",
        mongoTemplateRef = "movieMongoTemplate")
public interface MoviesNowPlayingRepository extends MongoRepository<MoviesNowPlaying, String> {
}
