package com.briup.apps.app02.dao;


import com.briup.apps.app02.bean.User;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-04-16:01
 */
public interface UserMapper {
    List<User> query(User user);

    List<User> selectAll();

    User selectByPrimaryKey(long id);

    void insert(User user);

    void update(User user);

    void deleteByPrimaryKey(long id);
}
