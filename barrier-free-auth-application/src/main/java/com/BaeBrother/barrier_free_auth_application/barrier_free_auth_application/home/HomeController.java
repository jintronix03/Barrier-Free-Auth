package com.BaeBrother.barrier_free_auth_application.barrier_free_auth_application.home;

import com.BaeBrother.barrier_free_auth_application.barrier_free_auth_application.security.Account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = {"/", "home"}, method = RequestMethod.GET)
    public String home(ModelMap model) {
        Long userId = accountService.getId();
        String username = accountService.getUsername();
        model.addAttribute("username", username);
        model.addAttribute("userId", userId);
        return "home";
    }
}