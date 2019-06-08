package com.briup.apps.app02.dao.extend;

import com.briup.apps.app02.bean.extend.StudentCourseExtend;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-06-12:37
 */
public interface StudentCourseExtendMapper {


    List<StudentCourseExtend> selectxkcourse();
    List<StudentCourseExtend> selectstucourse();
    List<StudentCourseExtend> selectteacourse();
}
