package bookManager.dao;

import bookManager.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    private Session openSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    @SuppressWarnings("unchecked")
    public User getUser(String login) {
        List<User> userList = new ArrayList<User>();
        userList = openSession().createQuery("from User u where u.login =:login")
                .setParameter("login", login)
                .list();
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;
    }

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(user);
    }
}
