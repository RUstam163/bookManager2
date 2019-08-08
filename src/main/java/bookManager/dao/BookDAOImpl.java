package bookManager.dao;

import bookManager.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class BookDAOImpl implements BookDAO {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Book> booksMap = new HashMap<>();
    static {
        Book book1 = new Book();
        book1.setId(AUTO_ID.getAndIncrement());
        book1.setTitle("Inception");
        book1.setYear(2010);
        book1.setGenre("sci-fi");
        book1.setWatched(true);
        booksMap.put(book1.getId(), book1);
        Book book2 = new Book();
        book2.setId(AUTO_ID.getAndIncrement());
        book2.setTitle("Rom");
        book2.setYear(2099);
        book2.setGenre("Theter");
        book2.setWatched(true);
        booksMap.put(book2.getId(), book2);

        // + film2, film3, film4, ...
    }


    @Override
    public List<Book> allBook() {
        return new ArrayList<>(booksMap.values());
    }

    @Override
    public void add(Book book) {
        book.setId(AUTO_ID.getAndIncrement());
        booksMap.put(book.getId(), book);
    }

    @Override
    public void delete(Book book) {
        booksMap.remove(book.getId());
    }

    @Override
    public void edit(Book book) {
        booksMap.put(book .getId(), book);
    }

    @Override
    public Book getById(int id) {
        return booksMap.get(id);
    }
}
