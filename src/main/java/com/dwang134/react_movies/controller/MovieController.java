package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.MoviesNowPlaying;
import com.dwang134.react_movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
@CrossOrigin(origins = "http://localhost:3000")

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

    @GetMapping("/search")
    public List<MoviesNowPlaying> searchMoviesByTitle(@RequestParam String title) {
        return movieService.searchMoviesByTitle(title);
    }
}
