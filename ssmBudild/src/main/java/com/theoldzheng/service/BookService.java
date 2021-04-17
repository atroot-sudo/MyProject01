package com.theoldzheng.service;


import com.theoldzheng.pojo.Books;

import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.16 16:47
 */
public interface BookService {
    int addBook(Books book);

    int delete(Integer id);

    int update(Books book);

    Books queryById(Integer id);

    List<Books> queryAllBook();
}
