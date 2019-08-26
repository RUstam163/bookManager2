package bookManager.dao;

import bookManager.model.Genre;

import java.util.List;

public interface GenreDAO {
    List<Genre> allGenre();

    void add(Genre genre);

    void delete(Genre genre);

    void edit(Genre genre);

    Genre getById(int id);
}
