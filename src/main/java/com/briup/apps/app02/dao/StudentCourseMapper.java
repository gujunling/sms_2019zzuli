package com.briup.apps.app02.dao;

import com.briup.apps.app02.bean.StudentCourse;
import com.briup.apps.app02.bean.User;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-05-15:15
 */
public interface StudentCourseMapper {
    List<StudentCourse> selectAll();

    StudentCourse selectByPrimaryKey(long id);
    void insert (StudentCourse studentCourse);
    void update (StudentCourse studentCourse);
    void deleteByPrimaryKey (long id);

}
