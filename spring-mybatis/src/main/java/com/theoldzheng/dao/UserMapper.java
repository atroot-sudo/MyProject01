package com.theoldzheng.dao;

import com.theoldzheng.pojo.User;

import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.15 10:36
 */
public interface UserMapper {
    List<User> getUserList();
}
