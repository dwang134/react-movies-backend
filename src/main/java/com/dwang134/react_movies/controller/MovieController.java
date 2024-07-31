package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.MoviesNowPlaying;
import com.dwang134.react_movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/now_playing")
    public List<MoviesNowPlaying> getAllMovies() {
        return movieService.getAllMovies();
    }
}

