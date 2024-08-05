package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.MoviesNowPlaying;
import com.dwang134.react_movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


import java.util.List;

@RestController
@RequestMapping("/api/movie")
@CrossOrigin(origins = "http://localhost:3000")

public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/now_playing")
    public ResponseEntity<List<MoviesNowPlaying>> getAllMoviesNowPlaying() {
        List<MoviesNowPlaying> moviesNowPlayingList = movieService.getAllMoviesNowPlaying();
        return ResponseEntity.ok(moviesNowPlayingList);
    }

    @GetMapping("/now_playing/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable int id) {
        if (id <= 0) {
            return ResponseEntity.badRequest().body("Invalid movie ID.");
        }

        Optional<MoviesNowPlaying> movie = movieService.getMovieById(id);
        if (movie.isPresent()) {
            return ResponseEntity.ok(movie.get());
        } else {
            return ResponseEntity.badRequest().body("Movie not found.");
        }
    }

    @GetMapping("/search")
    public List<MoviesNowPlaying> searchMoviesByTitle(@RequestParam String title) {
        return movieService.searchMoviesByTitle(title);
    }
}
