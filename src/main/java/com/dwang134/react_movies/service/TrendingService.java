package com.dwang134.react_movies.service;

import com.dwang134.react_movies.model.TrendingAll;
import com.dwang134.react_movies.model.TrendingMovie;
import com.dwang134.react_movies.model.TrendingPeople;
import com.dwang134.react_movies.repository.TrendingAllRepository;
import com.dwang134.react_movies.repository.TrendingMovieRepository;
import com.dwang134.react_movies.repository.TrendingPeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrendingService {

    @Autowired
    private TrendingAllRepository trendingAllRepository;

    @Autowired
    private TrendingMovieRepository trendingMovieRepository;

    @Autowired
    private TrendingPeopleRepository trendingPersonRepository;

    public List<TrendingAll> getAllTrendingAll() {
        return trendingAllRepository.findAll();
    }

    public TrendingAll getTrendingAllById(int id) {
        return trendingAllRepository.findById(id).orElse(null);
    }

    public List<TrendingMovie> getAllTrendingMovies() {
        return trendingMovieRepository.findAll();
    }

    public TrendingMovie getTrendingMovieById(int id) {
        return trendingMovieRepository.findById(id).orElse(null);
    }

    public List<TrendingPeople> getAllTrendingPersons() {
        return trendingPersonRepository.findAll();
    }

    public TrendingPeople getTrendingPersonById(int personId) {
        return trendingPersonRepository.findByPersonId(personId).orElse(null);
    }
}
