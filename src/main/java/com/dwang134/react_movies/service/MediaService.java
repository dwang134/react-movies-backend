package com.dwang134.react_movies.service;

import com.dwang134.react_movies.model.Media;
import com.dwang134.react_movies.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Media> media = mediaRepository.findById(id);
        return media.orElse(null);
    }

    public List<Media> getMediaByType(String type) {
        return mediaRepository.findByType(type);
    }

    public Media getMediaByIdAndType(String id, String type) {
        Optional<Media> media = mediaRepository.findByIdAndType(id, type);
        return media.orElse(null);
    }

    public List<Media> getFeaturedMediaByType(String type) {
        return mediaRepository.findByTypeAndFeaturedTrue(type);
    }
}
