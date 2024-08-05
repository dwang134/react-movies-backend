package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.TvAiringToday;
import com.dwang134.react_movies.service.TvAiringTodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tv")
@CrossOrigin(origins = "http://localhost:3000")
public class TvController {

    @Autowired
    private TvAiringTodayService tvAiringTodayService;


    @GetMapping("/airing_today")
    public ResponseEntity<List<TvAiringToday>> getAllAiringToday() {
        List<TvAiringToday> airingTodayList = tvAiringTodayService.getAllAiringToday();
        return ResponseEntity.ok(airingTodayList);
    }

    @GetMapping("/airing_today/{id}")
    public ResponseEntity<?> getAiringTodayById(@PathVariable int id) {
        if (id <= 0) {
            return ResponseEntity.badRequest().body("Invalid TV show ID.");
        }

        Optional<TvAiringToday> airingToday = tvAiringTodayService.getAiringTodayById(id);
        if (airingToday.isPresent()) {
            return ResponseEntity.ok(airingToday.get());
        } else {
            return ResponseEntity.badRequest().body("TV show not found.");
        }
    }

    @GetMapping("/search")
    public List<TvAiringToday> searchByTitle(@RequestParam String title) {
        return tvAiringTodayService.searchByTitle(title);
    }
}
