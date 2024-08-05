package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.TrendingAll;
import com.dwang134.react_movies.model.TrendingMovie;
import com.dwang134.react_movies.model.TrendingPeople;
import com.dwang134.react_movies.service.TrendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trending")
@CrossOrigin(origins = "http://localhost:3000")

public class TrendingController {

    @Autowired
    private TrendingService trendingService;

    @GetMapping("/all")
    public List<TrendingAll> getAllTrendingAll() {
        return trendingService.getAllTrendingAll();
    }

    @GetMapping("/all/{id}")
    public TrendingAll getTrendingAllById(@PathVariable int id) {
        return trendingService.getTrendingAllById(id);
    }

    @GetMapping("/movie")
    public List<TrendingMovie> getAllTrendingMovies() {
        return trendingService.getAllTrendingMovies();
    }

    @GetMapping("/movie/{id}")
    public TrendingMovie getTrendingMovieById(@PathVariable int id) {
        return trendingService.getTrendingMovieById(id);
    }

    @GetMapping("/person")
    public List<TrendingPeople> getAllTrendingPersons() {
        return trendingService.getAllTrendingPersons();
    }

    @GetMapping("/person/{personId}")
    public TrendingPeople getTrendingPersonById(@PathVariable int personId) {
        return trendingService.getTrendingPersonById(personId);
    }
}
