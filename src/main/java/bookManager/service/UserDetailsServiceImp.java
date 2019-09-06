package bookManager.service;

import bookManager.dao.UserDAO;
import bookManager.model.Role;
import bookManager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Service("userDetailsService")
public class UserDetailsServiceImp implements UserDetailsService {
//
//    private UserDAO userDAO;
//
//    @Autowired
//    public void setUserDAO(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }
//
//    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userDAO.findByUserName(username);
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        for (Role role : user.getRoles()) {
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
    return null;
    }

}
