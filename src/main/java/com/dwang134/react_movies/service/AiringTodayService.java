package com.dwang134.react_movies.service;

import com.dwang134.react_movies.model.AiringToday;
import com.dwang134.react_movies.repository.AiringTodayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AiringTodayService {

    @Autowired
    private AiringTodayRepository airingTodayRepository;

    public List<AiringToday> getAllAiringToday() {
        return airingTodayRepository.findAll();
    }

    public AiringToday getAiringTodayById(int id) {
        return airingTodayRepository.findById(id).orElse(null);
    }
}
