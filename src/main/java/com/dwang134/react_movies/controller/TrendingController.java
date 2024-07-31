package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.TrendingAll;
import com.dwang134.react_movies.model.TrendingMovie;
import com.dwang134.react_movies.model.TrendingPeople;
import com.dwang134.react_movies.service.TrendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trending")
public class TrendingController {

    @Autowired
    private TrendingService trendingService;

    @GetMapping("/all")
    public List<TrendingAll> getAllTrendingAll() {
        return trendingService.getAllTrendingAll();
    }

    @GetMapping("/movie")
    public List<TrendingMovie> getAllTrendingMovies() {
        return trendingService.getAllTrendingMovies();
    }

    @GetMapping("/person")
    public List<TrendingPeople> getAllTrendingPersons() {
        return trendingService.getAllTrendingPersons();
    }
}
