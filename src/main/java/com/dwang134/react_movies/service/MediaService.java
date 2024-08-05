package com.dwang134.react_movies.service;

import com.dwang134.react_movies.model.Media;
import com.dwang134.react_movies.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    @Autowired
    private MediaRepository mediaRepository;

    public Media addMedia(Media media) {
        return mediaRepository.save(media);
    }

    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }

    public Media getMediaById(String id) {
        return mediaRepository.findById(id).orElse(null);
    }
}
