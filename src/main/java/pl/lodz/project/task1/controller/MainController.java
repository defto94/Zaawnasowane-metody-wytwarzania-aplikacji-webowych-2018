package pl.lodz.project.task1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    // This path is no longer used.
    // It will be redirected by OldLoginInterceptor
    @Deprecated
    @RequestMapping(value = {"/oldLogin"})
    public String oldLogin(Model model) {

        // Code here never run.
        return "oldLogin";
    }

    @RequestMapping(value = {"/login"})
    public String login(Model model) {

        System.out.println("\n-------- MainController.login --- ");

        System.out.println(" ** You are in Controller ** ");

        return "login";
    }

    @RequestMapping(value = {"/admin/admin"})
    public String admin(Model model) {

        System.out.println("\n-------- MainController.login --- ");

        System.out.println(" ** You are in Controller ** ");

        return "admin";
    }

}
