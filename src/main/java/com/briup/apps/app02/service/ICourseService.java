package com.briup.apps.app02.service;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.extend.CourseExtend;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-05-12:16
 */
public interface ICourseService {
    List<Course> query (Course course);
    List<Course> findAll();
    Course findById(long id);
    List<CourseExtend> findAllWithTeacher();
    void saveOrupdate(Course course) throws Exception;
    void deleteById(long id) throws Exception;
}
