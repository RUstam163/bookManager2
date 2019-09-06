package bookManager.controller;

import bookManager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class regestrationController {
//    @Autowired
//    private UserDAO userDAO;
//
//    @GetMapping("/registration")
//    public String registration() {
//        return "registration";
//    }
//
//    @PostMapping("/registration")
//    public String addUser(User user, Map<String, Object> model){
//        User userFromDb = userDAO.findByUsername(user.getUsername());
//       if (userFromDb != null) {
//           model.put("message","User exists");
//           return "regestration";
//       }
//       user.setActive(true);
//       user.setRoles(user.getRoles());
//        return "redirect:/login";
//    }

}
