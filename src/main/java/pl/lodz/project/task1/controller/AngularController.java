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
import pl.lodz.project.task1.domain.Magazine;
import pl.lodz.project.task1.domain.RequiredReading;
import pl.lodz.project.task1.domain.User;
import pl.lodz.project.task1.mapper.MagazineMapper;
import pl.lodz.project.task1.mapper.RequiredReadingMapper;
import pl.lodz.project.task1.mapper.UserMapper;

/**
 *
 * @author defto
 */
//Kontroler Angularowy WebService
@RestController
@RequestMapping("/public")
public class AngularController {
    
    private RequiredReadingMapper requiredReadingMapper;
    private MagazineMapper magazinesMapper;

    public AngularController(RequiredReadingMapper requiredReadingMapper, MagazineMapper magazinesMapper) {
        this.requiredReadingMapper = requiredReadingMapper;
        this.magazinesMapper = magazinesMapper;
    }
    
   @GetMapping(path = "/required")
    public List<RequiredReading> booksList() {
        return requiredReadingMapper.findAll();
    }
    
    @GetMapping(path = "/magazines")
    public List<Magazine> magazinesList() {
        return magazinesMapper.findAll();
    }
    
    
}
