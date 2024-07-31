package com.dwang134.react_movies.config;

import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfig {

    @Primary
    @Bean(name = "movieDatabaseFactory")
    public MongoDatabaseFactory movieDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory(MongoClients.create("mongodb+srv://dwang134:1X0LqHXZRqFVCklF@react-movies.bosal5g.mongodb.net/?retryWrites=true&w=majority&appName=react-movies"), "movie");
    }

    @Primary
    @Bean(name = "movieMongoTemplate")
    public MongoTemplate movieMongoTemplate() {
        return new MongoTemplate(movieDatabaseFactory());
    }

    @Bean(name = "trendingDatabaseFactory")
    public MongoDatabaseFactory trendingDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory(MongoClients.create("mongodb+srv://dwang134:1X0LqHXZRqFVCklF@react-movies.bosal5g.mongodb.net/?retryWrites=true&w=majority&appName=react-movies"), "trending");
    }

    @Bean(name = "trendingMongoTemplate")
    public MongoTemplate trendingMongoTemplate() {
        return new MongoTemplate(trendingDatabaseFactory());
    }

    @Bean(name = "tvDatabaseFactory")
    public MongoDatabaseFactory tvDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory(MongoClients.create("mongodb+srv://dwang134:1X0LqHXZRqFVCklF@react-movies.bosal5g.mongodb.net/?retryWrites=true&w=majority&appName=react-movies"), "tv");
    }

    @Bean(name = "tvMongoTemplate")
    public MongoTemplate tvMongoTemplate() {
        return new MongoTemplate(tvDatabaseFactory());
    }

    // This ensures there is always a default mongoTemplate bean if required by other components
    @Bean(name = "mongoTemplate")
    public MongoTemplate mongoTemplate() {
        return movieMongoTemplate();
    }
}
