package com.newwordpress.hum.web.controler;

import com.newwordpress.hum.persistence.model.user.User;
import com.newwordpress.hum.persistence.model.user.UserData;
import com.newwordpress.hum.persistence.repository.UserRepository;
import com.newwordpress.hum.service.UserDataService;
import com.newwordpress.hum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * Created by humin on 4/27/2017.
 */

@Controller
public class UserDataControler {

    @Autowired
    ActiveUserStore activeUserStore;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/loggedUsers", method = RequestMethod.GET)
    public String getLoggedUsers(final Locale locale, final Model model) {
        model.addAttribute("users", activeUserStore.getUsers());
        return "users";
    }

    @RequestMapping(value = "/loggedUsersFromSessionRegistry", method = RequestMethod.GET)
    public String getLoggedUsersFromSessionRegistry(final Locale locale, final Model model) {
        model.addAttribute("users", userService.getUsersFromSessionRegistry());
        return "users";
    }
}
