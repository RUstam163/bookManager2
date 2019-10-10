package bookManager.service;

import bookManager.model.User;

public interface UserService {

    public User getUser(String login);

    void addUser(User user);
}
