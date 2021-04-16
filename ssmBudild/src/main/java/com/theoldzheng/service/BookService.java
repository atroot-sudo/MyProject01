package com.theoldzheng.service;

import java.awt.print.Book;
import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.16 16:47
 */
public interface BookService {
    int addBook(Book book);

    int delete(Integer id);

    int update(Book book);

    Book queryById(Integer id);

    List<Book> queryAllBook();
}
