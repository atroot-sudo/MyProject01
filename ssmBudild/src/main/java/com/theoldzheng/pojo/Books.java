package com.theoldzheng.pojo;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.16 15:53
 */

public class Books {
    private Integer id;
    private String bookName;
    private Integer bookCount;
    private String detail;

    public Books() {
    }

    public Books(Integer id, String bookName, Integer bookCount, String detail) {
        this.id = id;
        this.bookName = bookName;
        this.bookCount = bookCount;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookCount=" + bookCount +
                ", detail='" + detail + '\'' +
                '}';
    }
}
