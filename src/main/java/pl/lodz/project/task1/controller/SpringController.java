/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.lodz.project.task1.domain.Book;
import pl.lodz.project.task1.domain.User;
import pl.lodz.project.task1.mapper.BookMapper;
import pl.lodz.project.task1.mapper.UserMapper;

/**
 *
 * @author defto
 */
//Kontroler SpringBootowy 
@Controller
@RequestMapping("/admin")
public class SpringController {

    private BookMapper booksMapper;
    private UserMapper usersMapper;

    public SpringController(BookMapper booksMapper, UserMapper usersMapper) {
        this.booksMapper = booksMapper;
        this.usersMapper = usersMapper;
    }

    //wyswietlanie ksiazek na http://localhost:8080/books/all
    @RequestMapping(value = {"/all"})
    public String booksList(Model model) {
        model.addAttribute("books", booksMapper.findAll());
        model.addAttribute("users", usersMapper.findAll());
        return "booksList";
    }

    @RequestMapping(value = {"/addBook"})
    public @ResponseBody
    String addNewBook(@RequestParam String TITLE, @RequestParam String AUTHOR, @RequestParam Integer ID_USER) {

        Book book = new Book();
        book.setTITLE(TITLE);
        book.setAUTHOR(AUTHOR);
        book.setID_USER(ID_USER);
        booksMapper.insert(book);
        return "Book saved";
    }

    @RequestMapping(path = "/deleteBook/{ID}")
    public @ResponseBody
    String deleteBook(@PathVariable("ID") Integer ID) {
        Book book = new Book();
        book.setID(ID);
        booksMapper.delete(book);
        return "Book deleted.";
    }

    @GetMapping(path = "/updateBook") // Map ONLY GET Requests
    public @ResponseBody
    String updateBook(@RequestParam Integer ID, @RequestParam String TITLE, @RequestParam String AUTHOR) {

        Book book = new Book();
        book.setID(ID);
        book.setTITLE(TITLE);
        book.setAUTHOR(AUTHOR);
        booksMapper.update(book);
        return "Book updated";
    }


}
