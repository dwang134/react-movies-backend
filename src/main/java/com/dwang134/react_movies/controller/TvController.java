package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.TvAiringToday;
import com.dwang134.react_movies.service.TvAiringTodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tv")
@CrossOrigin(origins = "http://localhost:3000")
public class TvController {

    @Autowired
    private TvAiringTodayService tvAiringTodayService;

    @GetMapping("/airing_today")
    public List<TvAiringToday> getAllAiringToday() {
        return tvAiringTodayService.getAllAiringToday();
    }

    @GetMapping("/airing_today/{id}")
    public TvAiringToday getAiringTodayById(@PathVariable int id) {
        return tvAiringTodayService.getAiringTodayById(id);
    }

    @GetMapping("/search")
    public List<TvAiringToday> searchByTitle(@RequestParam String title) {
        return tvAiringTodayService.searchByTitle(title);
    }
}
