package com.example.demo.serviceImpl;

import com.example.demo.entity.Genre;
import com.example.demo.repo.GenreRepository;
import com.example.demo.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Autowired
    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public Genre getGenreById(Long id) {
        return genreRepository.findById(id).orElse(null);
    }

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @Override
    public void deleteGenre(Long id) {
    genreRepository.deleteById(id);
    }
}
