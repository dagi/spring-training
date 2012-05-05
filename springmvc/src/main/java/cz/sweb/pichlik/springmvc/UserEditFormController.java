package cz.sweb.pichlik.springmvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import cz.sweb.pichlik.springdao.User;
import cz.sweb.pichlik.springdao.UserStorageDao;

@Controller
@RequestMapping("/editUser.htm")
@SessionAttributes("user")
public class UserEditFormController {

	@Autowired
	private UserStorageDao userStorageDao;

	@RequestMapping(method = RequestMethod.GET)
    public String setupForm(ModelMap model) {
        model.addAttribute("user", new User());
        return "editUser"; //viewname
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit( @ModelAttribute("user") @Valid User user, BindingResult result, SessionStatus status) {
        if (result.hasErrors()) {
            return "editUser";
        }

        userStorageDao.save(user);
        status.setComplete();
        return "redirect:users.htm";
    }
}
