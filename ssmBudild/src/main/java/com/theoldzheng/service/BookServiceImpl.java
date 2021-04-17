package com.theoldzheng.service;

import com.theoldzheng.dao.BookMapper;
import com.theoldzheng.pojo.Books;

import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.16 16:48
 */

public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int delete(Integer id) {
        return bookMapper.delete(id);
    }

    @Override
    public int update(Books book) {
        return bookMapper.update(book);
    }

    @Override
    public Books queryById(Integer id) {
        return bookMapper.queryById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
