package bookManager.dao;

import bookManager.model.Author;
import bookManager.model.Book;
import bookManager.model.Genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public class BookDAOImpl implements BookDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Book> allBook() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Book book join fetch book.genre join fetch book.author").list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Genre> genreList() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Genre").list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Author> authorList() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Author ").list();
    }


    @Override
    public void add(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(book);
    }

    @Override
    public void delete(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(book);
    }

    @Override
    public void edit(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.update(book);
    }

    @Override
    public Book getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Book.class, id);
    }
}
