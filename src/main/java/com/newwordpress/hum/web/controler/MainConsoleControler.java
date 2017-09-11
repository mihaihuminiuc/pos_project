package com.newwordpress.hum.web.controler;

import com.newwordpress.hum.persistence.repository.ContentRepository;
import com.newwordpress.hum.persistence.repository.UserRepository;
import com.newwordpress.hum.web.dto.ContentPageDto;
import com.newwordpress.hum.web.dto.UserDto;
import com.newwordpress.hum.web.util.GenericResponse;
import groovy.util.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
 * Created by humin on 5/1/2017.
 */



@Controller
public class MainConsoleControler {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ContentRepository contentRepository;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String setupMainConsole(final ModelMap model) throws UnsupportedEncodingException {
        //model.addAttribute("pageContent","asd");
        return "home";
    }


    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String savePage(
            @RequestParam("dynamicframe")String pageContent) throws UnsupportedEncodingException {
        String test=pageContent;
        return "home";
    }

}