package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.AiringToday;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.dwang134.react_movies.repository",
        mongoTemplateRef = "tvMongoTemplate")
public interface AiringTodayRepository extends MongoRepository<AiringToday, String> {
}