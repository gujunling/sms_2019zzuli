package com.briup.apps.app02.dao;

import com.briup.apps.app02.bean.Course;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-05-12:15
 */
public interface CourseMapper {
    List<Course> query(Course course);
    List<Course> selectAll();

    Course selectByPrimaryKey(long id);

    void insert(Course course);

    void update(Course course);

    void deleteByPrimaryKey(long id);
}
