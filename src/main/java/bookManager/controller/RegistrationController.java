package bookManager.controller;

import bookManager.model.User;
import bookManager.service.RoleService;
import bookManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegistrationController {
    private UserService userService;

    private RoleService roleService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping(value = "/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String addUser(User user) {
        User userDB = userService.getUser(user.getLogin());
        if (userDB != null) {
            return "redirect:/registration";
        }
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        user.setRole(roleService.getRole(1));
        userService.addUser(user);
        return "redirect:/login";
    }

}
