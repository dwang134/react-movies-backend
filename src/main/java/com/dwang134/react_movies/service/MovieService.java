package com.dwang134.react_movies.service;

import com.dwang134.react_movies.model.MoviesNowPlaying;
import com.dwang134.react_movies.repository.MoviesNowPlayingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MoviesNowPlayingRepository moviesNowPlayingRepository;

    public List<MoviesNowPlaying> getAllMovies() {
        return moviesNowPlayingRepository.findAll();
    }
}