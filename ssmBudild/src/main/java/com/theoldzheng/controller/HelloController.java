package com.theoldzheng.controller;

import com.theoldzheng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.theoldzheng.pojo.Books;
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
        List<Books> books = bookService.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
        return "books";
    }
}
