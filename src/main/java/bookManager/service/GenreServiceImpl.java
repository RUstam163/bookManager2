package bookManager.service;

import bookManager.dao.GenreDAO;
import bookManager.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    private GenreDAO genreDAO;

    @Autowired
    public void setGenreDAO(GenreDAO genreDAO) {
        this.genreDAO = genreDAO;
    }

    @Override
    @Transactional
    public List<Genre> allGenre() {
        return genreDAO.allGenre();
    }

    @Override
    @Transactional
    public void add(Genre genre) {
        genreDAO.add(genre);
    }

    @Override
    @Transactional
    public void delete(Genre genre) {
        genreDAO.delete(genre);
    }

    @Override
    @Transactional
    public void edit(Genre genre) {
        genreDAO.edit(genre);
    }

    @Override
    @Transactional
    public Genre getById(int id) {
        return genreDAO.getById(id);
    }
}
