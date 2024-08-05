package com.dwang134.react_movies.controller;

import com.dwang134.react_movies.model.Media;
import com.dwang134.react_movies.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/media")
@CrossOrigin(origins = "http://localhost:3000")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    @PostMapping("/add")
    public ResponseEntity<Media> addMedia(@RequestBody Media media) {
        Media createdMedia = mediaService.addMedia(media);
        return ResponseEntity.ok(createdMedia);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Media>> getAllMedia() {
        List<Media> mediaList = mediaService.getAllMedia();
        return ResponseEntity.ok(mediaList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Media> getMediaById(@PathVariable String id) {
        Media media = mediaService.getMediaById(id);
        if (media != null) {
            return ResponseEntity.ok(media);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/movie")
    public ResponseEntity<List<Media>> getAllMovies() {
        List<Media> mediaList = mediaService.getMediaByType("movie");
        return ResponseEntity.ok(mediaList);
    }

    @GetMapping("/tv")
    public ResponseEntity<List<Media>> getAllTVShows() {
        List<Media> mediaList = mediaService.getMediaByType("tv");
        return ResponseEntity.ok(mediaList);
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<Media> getMovieById(@PathVariable String id) {
        Media media = mediaService.getMediaByIdAndType(id, "movie");
        if (media != null) {
            return ResponseEntity.ok(media);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/tv/{id}")
    public ResponseEntity<Media> getTVShowById(@PathVariable String id) {
        Media media = mediaService.getMediaByIdAndType(id, "tv");
        if (media != null) {
            return ResponseEntity.ok(media);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/all/featured")
    public ResponseEntity<List<Media>> getFeaturedMedia(@RequestParam String type) {
        List<Media> mediaList = mediaService.getFeaturedMediaByType(type);
        return ResponseEntity.ok(mediaList);
    }
}
