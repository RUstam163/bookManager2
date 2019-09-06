package bookManager.dao;

import bookManager.model.Author;
import bookManager.model.Book;
import bookManager.model.Genre;

import java.util.List;

public interface BookDAO {
    List<Book> allBook();

    List<Genre> genreList();

    List<Author> authorList();

    void add(Book book);

    void delete(Book book);

    void edit(Book book);

    Book getById(int id);
}
