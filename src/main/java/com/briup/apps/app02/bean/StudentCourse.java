package com.briup.apps.app02.bean;

/**
 * @author gujunqi
 * @create 2019-06-05-14:55
 */
public class StudentCourse {
    private Long id;
    private String xk_time;
    private String grade;
    private Long student_id;
    private Long course_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getXk_time() {
        return xk_time;
    }

    public void setXk_time(String xk_time) {
        this.xk_time = xk_time;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }
}
