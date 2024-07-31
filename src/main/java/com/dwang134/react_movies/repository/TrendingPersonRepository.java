package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.TrendingPeople;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrendingPersonRepository extends MongoRepository<TrendingPeople, String> {}
