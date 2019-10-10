package bookManager.dao;

import bookManager.model.User;

public interface UserDAO {

     User getUser(String login);

     void addUser(User user);
}
