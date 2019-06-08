package com.briup.apps.app02.bean.extend;

import com.briup.apps.app02.bean.StudentCourse;
import com.briup.apps.app02.bean.User;

/**
 * @author gujunqi
 * @create 2019-06-06-12:37
 */
public class StudentCourseExtend extends StudentCourse {
    private StudentCourse coursename;
    private StudentCourse stucourse;
    private User teacourse;

    public StudentCourse getCoursename() {
        return coursename;
    }

    public void setCoursename(StudentCourse coursename) {
        this.coursename = coursename;
    }

    public StudentCourse getStucourse() {
        return stucourse;
    }

    public void setStucourse(StudentCourse stucourse) {
        this.stucourse = stucourse;
    }

    public User getTeacourse() {
        return teacourse;
    }

    public void setTeacourse(User teacourse) {
        this.teacourse = teacourse;
    }
}

