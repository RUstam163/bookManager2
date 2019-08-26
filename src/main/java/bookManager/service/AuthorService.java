package bookManager.service;

import bookManager.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> allAuthor();

    void add(Author author);

    void delete(Author author);

    void edit(Author author);

    Author getById(int id);
}
