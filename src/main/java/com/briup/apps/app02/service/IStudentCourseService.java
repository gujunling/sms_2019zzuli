package com.briup.apps.app02.service;

import com.briup.apps.app02.bean.StudentCourse;

import com.briup.apps.app02.bean.extend.CourseExtend;
import com.briup.apps.app02.bean.extend.StudentCourseExtend;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-05-14:56
 */

public interface IStudentCourseService {
    List<StudentCourse> findAll();

    StudentCourse findById(long id);
    List<StudentCourseExtend> findcoursenameById();
    List<StudentCourseExtend> findstucourseById();
    List<StudentCourseExtend> findteacourseById();

    void saveOrupdate(StudentCourse studentCourse) throws Exception;

    void deleteById(long id) throws Exception;
}
