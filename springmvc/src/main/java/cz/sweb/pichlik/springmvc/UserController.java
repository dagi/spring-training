package cz.sweb.pichlik.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cz.sweb.pichlik.springdao.UserStorageDao;

@Controller
public class UserController {

    @Autowired
    private UserStorageDao userStorageDao;

    @RequestMapping("/users.htm")
    public ModelMap usersHandler() {
        return new ModelMap("users", userStorageDao.getAll());
    }

}
