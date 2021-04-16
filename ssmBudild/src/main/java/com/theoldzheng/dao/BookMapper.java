package com.theoldzheng.dao;

import java.awt.print.Book;
import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.16 16:23
 */
public interface BookMapper {
    int addBook(Book book);

    int delete(Integer id);

    int update(Book book);

    Book queryById(Integer id);

    List<Book> queryAllBook();
}
