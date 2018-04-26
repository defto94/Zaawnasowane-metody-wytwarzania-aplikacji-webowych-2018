/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lodz.project.task1.domain.Book;
import pl.lodz.project.task1.mapper.BookMapper;

/**
 *
 * @author defto
 */
@RestController
@RequestMapping("/books")
public class BookController {
    
    private BookMapper booksMapper;

    public BookController(BookMapper booksMapper) {
        this.booksMapper = booksMapper;
    }
    
    @GetMapping("all")
    public List<Book> getAll() {
        return booksMapper.findAll();
    }
}
