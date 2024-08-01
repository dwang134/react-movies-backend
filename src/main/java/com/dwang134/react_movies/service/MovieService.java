package com.dwang134.react_movies.service;

import com.dwang134.react_movies.model.MoviesNowPlaying;
import com.dwang134.react_movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MoviesNowPlaying> getAllMoviesNowPlaying() {
        return movieRepository.findAll();
    }

    public MoviesNowPlaying getMovieById(int id) {
        return movieRepository.findById(id).orElse(null);
    }
}
