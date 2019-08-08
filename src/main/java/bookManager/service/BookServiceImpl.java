package bookManager.service;

import bookManager.dao.BookDAO;
import bookManager.dao.BookDAOImpl;
import bookManager.model.Book;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDAO bookDAO = new BookDAOImpl();

    @Override
    public List<Book> allBook() {
        return bookDAO.allBook();
    }

    @Override
    public void add(Book book) {
        bookDAO.add(book);
    }

    @Override
    public void delete(Book book) {
        bookDAO.delete(book);
    }

    @Override
    public void edit(Book book) {
        bookDAO.edit(book);
    }

    @Override
    public Book getById(int id) {
        return bookDAO.getById(id);
    }
}
