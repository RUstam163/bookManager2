package bookManager.service;

import bookManager.dao.BookDAO;
import bookManager.model.Author;
import bookManager.model.Book;
import bookManager.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;

    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional
    public List<Book> allBook() {
        return bookDAO.allBook();
    }

    @Override
    @Transactional
    public List<Genre> genreList() {
        return bookDAO.genreList();
    }

    @Override
    @Transactional
    public List<Author> authorList() {
        return bookDAO.authorList();
    }

    @Override
    @Transactional
    public void add(Book book) {
        bookDAO.add(book);
    }

    @Override
    @Transactional
    public void delete(Book book) {
        bookDAO.delete(book);
    }

    @Override
    @Transactional
    public void edit(Book book) {
        bookDAO.edit(book);
    }

    @Override
    @Transactional
    public Book getById(int id) {
        return bookDAO.getById(id);
    }
}
