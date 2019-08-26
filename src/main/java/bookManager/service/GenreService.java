package bookManager.service;

import bookManager.model.Genre;

import java.util.List;

public interface GenreService {
    List<Genre> allGenre();

    void add(Genre genre);

    void delete(Genre genre);

    void edit(Genre genre);

    Genre getById(int id);
}
