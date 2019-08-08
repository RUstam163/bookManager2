package bookManager.service;

import bookManager.model.Book;

import java.util.List;

public interface BookService {
    List<Book> allBook();
    void add(Book book);
    void delete(Book book);
    void edit(Book book);
    Book getById(int id);
}
