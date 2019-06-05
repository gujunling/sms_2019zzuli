package com.briup.apps.app02.service;

import com.briup.apps.app02.bean.User;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-04-16:04
 */
public interface IUserService {
    List<User> query(User user);

    List<User> findAll();

    User findById(long id);

    void saveOrupdate(User user) throws Exception;

    void deleteById(long id) throws Exception;
}
