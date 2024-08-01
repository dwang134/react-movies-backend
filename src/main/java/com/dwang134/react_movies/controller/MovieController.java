package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.MoviesNowPlaying;
import com.dwang134.react_movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/now_playing")
    public List<MoviesNowPlaying> getAllMoviesNowPlaying() {
        return movieService.getAllMoviesNowPlaying();
    }

    @GetMapping("/now_playing/{id}")
    public MoviesNowPlaying getMovieById(@PathVariable int id) {
        return movieService.getMovieById(id);
    }
}
