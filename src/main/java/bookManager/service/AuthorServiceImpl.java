package bookManager.service;

import bookManager.dao.AuthorDAO;
import bookManager.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorDAO authorDAO;

    @Autowired
    public void setAuthorDAO(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    @Override
    @Transactional
    public List<Author> allAuthor() {
        return authorDAO.allAuthor();
    }

    @Override
    @Transactional
    public void add(Author author) {
        authorDAO.add(author);
    }

    @Override
    @Transactional
    public void delete(Author author) {
        authorDAO.delete(author);
    }

    @Override
    @Transactional
    public void edit(Author author) {
        authorDAO.edit(author);
    }

    @Override
    @Transactional
    public Author getById(int id) {
        return authorDAO.getById(id);
    }
}
