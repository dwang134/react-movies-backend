package com.dwang134.react_movies.repository;

import com.dwang134.react_movies.model.TrendingAll;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrendingAllRepository extends MongoRepository<TrendingAll, String> {}
