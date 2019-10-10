package bookManager.service;

import bookManager.dao.UserDAO;
import bookManager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public User getUser(String login) {
            return userDAO.getUser(login);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
