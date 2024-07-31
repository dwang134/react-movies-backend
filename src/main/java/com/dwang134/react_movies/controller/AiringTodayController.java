package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.AiringToday;
import com.dwang134.react_movies.service.AiringTodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tv")
public class AiringTodayController {

    @Autowired
    private AiringTodayService airingTodayService;

    @GetMapping("/airing_today")
    public List<AiringToday> getAllAiringToday() {
        return airingTodayService.getAllAiringToday();
    }
}
