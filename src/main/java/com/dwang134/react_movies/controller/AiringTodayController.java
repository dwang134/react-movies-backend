package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.AiringToday;
import com.dwang134.react_movies.service.AiringTodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tv")
@CrossOrigin(origins = "http://localhost:3000")
public class AiringTodayController {

    @Autowired
    private AiringTodayService airingTodayService;

    @GetMapping("/airing_today")
    public List<AiringToday> getAllAiringToday() {
        return airingTodayService.getAllAiringToday();
    }

    @GetMapping("/airing_today/{id}")
    public AiringToday getAiringTodayById(@PathVariable int id) {
        return airingTodayService.getAiringTodayById(id);
    }
}
