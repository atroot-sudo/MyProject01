package com.theoldzheng.controller;

import com.theoldzheng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.16 21:04
 */
@Controller
public class HelloController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/hello")
    public String hello(){
        List<Book> books = bookService.queryAllBook();
        for (Book book : books) {
            System.out.println(book);
        }
        return "books";
    }
}
