package com.newwordpress.hum.web.controler;

import com.newwordpress.hum.persistence.model.user.User;
import com.newwordpress.hum.persistence.model.user.UserData;
import com.newwordpress.hum.persistence.repository.UserRepository;
import com.newwordpress.hum.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by humin on 4/27/2017.
 */

@Controller
public class UserDataControler {

    @Autowired
    private UserDataService userDataService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HttpSession httpSession;

    @RequestMapping(value = {"/userdata"}, method = RequestMethod.GET)
    public ModelAndView accountDetails() {

        UserData userData;
        ModelAndView model = new ModelAndView();
        if(httpSession!=null){
            userData=userRepository.findByUsername(httpSession.getAttribute("username").toString()).getUserDatas();
            model.addObject("userDataForm",userData );
        }

        return model;
    }

    @RequestMapping(value = {"/userdata"}, method = RequestMethod.POST)
    public String accountDetails(@ModelAttribute("userDataForm") UserData userForm, BindingResult bindingResult, Model model) {

        User user;

        if (bindingResult.hasErrors()) {
            return "userdata";
        }

        if(httpSession!=null){
            user=userRepository.findByUsername(httpSession.getAttribute("username").toString());
            httpSession.setAttribute("username",user.getUsername());
            userForm.setUser(user);
        }

        userDataService.save(userForm);
        return "userdata";
    }
}
