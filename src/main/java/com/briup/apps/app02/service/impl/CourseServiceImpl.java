package com.briup.apps.app02.service.impl;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.extend.CourseExtend;
import com.briup.apps.app02.dao.CourseMapper;
import com.briup.apps.app02.dao.extend.CourseExtendMapper;
import com.briup.apps.app02.service.ICourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-05-12:17
 */
@Service
public class CourseServiceImpl implements ICourseService {
    @Resource
    private CourseMapper courseMapper;
    @Resource
    private CourseExtendMapper courseExtendMapper;


    @Override
    public List<Course> query(Course course) {
        return courseMapper.query(course);
    }

    @Override
    public List<Course> findAll() {

        return courseMapper.selectAll();
    }

    @Override
    public Course findById(long id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CourseExtend> findAllWithTeacher() {
        return courseExtendMapper.selectAll();
    }

    @Override
    public void saveOrupdate(Course course) throws Exception {
        if (course.getId() == null) {
            courseMapper.insert(course);
        } else {
            courseMapper.update(course);
        }
    }

    @Override
    public void deleteById(long id) throws Exception {
        Course course = courseMapper.selectByPrimaryKey(id);
        if(course ==null){
            throw new Exception("删除的课程不存在");
        }else{
            courseMapper.deleteByPrimaryKey(id);
        }

    }
}
