package com.briup.apps.app02.bean.extend;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.StudentCourse;
import com.briup.apps.app02.bean.User;

/**
 * @author gujunqi
 * @create 2019-06-06-12:37
 */
public class StudentCourseExtend extends StudentCourse {
    private Course coursename;
    private User teacourse;

    public Course getCoursename() {
        return coursename;
    }

    public void setCoursename(Course coursename) {
        this.coursename = coursename;
    }



    public User getTeacourse() {
        return teacourse;
    }

    public void setTeacourse(User teacourse) {
        this.teacourse = teacourse;
    }
}

