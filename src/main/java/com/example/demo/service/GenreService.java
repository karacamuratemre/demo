package com.example.demo.service;

import com.example.demo.entity.Genre;

import java.util.List;

public interface GenreService {

    Genre saveGenre(Genre genre);
    Genre getGenreById(Long id);
    List<Genre> getAllGenres();
    void deleteGenre(Long id);
}
