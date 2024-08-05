package com.dwang134.react_movies.service;

import com.dwang134.react_movies.model.TvAiringToday;
import com.dwang134.react_movies.repository.TvRepository;
import com.dwang134.react_movies.repository.TvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TvAiringTodayService {

    @Autowired
    private TvRepository tvRepository;

    public List<TvAiringToday> getAllAiringToday() {
        return tvRepository.findAll();
    }

    public TvAiringToday getAiringTodayById(int id) {
        return tvRepository.findById(id).orElse(null);
    }

    public List<TvAiringToday> searchByTitle(String name) {
        return tvRepository.findByTitleRegexIgnoreCase(name);
    }
}
