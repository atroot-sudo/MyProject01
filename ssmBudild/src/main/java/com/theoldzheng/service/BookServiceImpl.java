package com.theoldzheng.service;

import com.theoldzheng.dao.BookMapper;

import java.awt.print.Book;
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
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int delete(Integer id) {
        return bookMapper.delete(id);
    }

    @Override
    public int update(Book book) {
        return bookMapper.update(book);
    }

    @Override
    public Book queryById(Integer id) {
        return bookMapper.queryById(id);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
