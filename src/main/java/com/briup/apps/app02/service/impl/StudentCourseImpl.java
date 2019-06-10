package com.briup.apps.app02.service.impl;

import com.briup.apps.app02.bean.StudentCourse;
import com.briup.apps.app02.bean.StudentCourseExample;
import com.briup.apps.app02.bean.extend.StudentCourseExtend;
import com.briup.apps.app02.dao.StudentCourseMapper;
import com.briup.apps.app02.dao.extend.StudentCourseExtendMapper;
import com.briup.apps.app02.service.IStudentCourseService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-05-14:57
 */
@Service
public class StudentCourseImpl implements IStudentCourseService {
    @Resource
    private StudentCourseMapper studentCourseMapper;
    @Resource
    private StudentCourseExtendMapper studentcourseextendMapper;

    @Override
    public List<StudentCourse> findAll() {
        StudentCourseExample example  =new StudentCourseExample();
        return studentCourseMapper.selectByExample(example);
    }

    @Override
    public StudentCourse findById(long id) {
        return studentCourseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<StudentCourseExtend> findcoursenameById() {
        return studentcourseextendMapper.selectxkcourse();
    }

    @Override
    public List<StudentCourseExtend> findstucourseById() {
        return studentcourseextendMapper.selectstucourse();
    }

    @Override
    public List<StudentCourseExtend> findteacourseById() {
        return studentcourseextendMapper.selectteacourse();
    }

    @Override
    public void saveOrupdate(StudentCourse studentCourse) throws Exception {
        if (studentCourse.getId() == null) {
            studentCourseMapper.insert(studentCourse);
        } else {
            studentCourseMapper.updateByPrimaryKey(studentCourse);
        }
    }

    @Override
    public void deleteById(long id) throws Exception {
        StudentCourse studentCourse = studentCourseMapper.selectByPrimaryKey(id);
        if(studentCourse ==null){
            throw new Exception("删除的选课信息不存在");
        }else{
            studentCourseMapper.deleteByPrimaryKey(id);
        }
    }
}
