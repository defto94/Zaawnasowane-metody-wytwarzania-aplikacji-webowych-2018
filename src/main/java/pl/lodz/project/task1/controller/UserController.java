/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lodz.project.task1.domain.User;
import pl.lodz.project.task1.mapper.UserMapper;

/**
 *
 * @author defto
 */
//Kontroler Angularowy WebService
@RestController
@RequestMapping("/users")
public class UserController {
    
    private UserMapper usersMapper;

    public UserController(UserMapper usersMapper) {
        this.usersMapper = usersMapper;
    }
    
   @GetMapping(path = "/all")
    public List<User> booksList() {
        return usersMapper.findAll();
        //return "usersList";
    }
    
    
}
