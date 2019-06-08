package com.briup.apps.app02.web.controller;

import com.briup.apps.app02.bean.StudentCourse;
import com.briup.apps.app02.bean.extend.CourseExtend;
import com.briup.apps.app02.bean.extend.StudentCourseExtend;
import com.briup.apps.app02.service.IStudentCourseService;
import com.briup.apps.app02.utils.Message;
import com.briup.apps.app02.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-05-14:58
 */
@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {
    @Autowired
    private IStudentCourseService studentCourseService;
    @ApiOperation("查询所有选课信息")
    @GetMapping("findAll")
    public Message findAll(){
        List<StudentCourse> list=studentCourseService.findAll();
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过课程查询所有选了这门课程的学生信息和选课的详细信息")
    @GetMapping("findcoursenameById")
    public Message findcoursenameById(){
        List<StudentCourseExtend> list = studentCourseService.findcoursenameById();
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过学生id查询出该学生选择了哪些课程")
    @GetMapping("findstucourseById")
    public Message findstucourseById(){
        List<StudentCourseExtend> list = studentCourseService.findstucourseById();
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过老师id查询出该老师教哪些课程")
    @GetMapping("findteacourseById")
    public Message findteacourseById(){
        List<StudentCourseExtend> list = studentCourseService.findteacourseById();
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过id查询选课信息")
    @GetMapping("findById")
    public Message findById(
            @ApiParam(value = "主键", required = true) @RequestParam(value = "id") long id) {
        StudentCourse studentCourse=studentCourseService.findById(id);
        return MessageUtil.success("success");
    }
    @ApiOperation("保存或更新选课信息")
    @GetMapping("saveOrupdate")
    public Message saveOrupdate(StudentCourse studentCourse){
        try {
            studentCourseService.saveOrupdate(studentCourse);
            return MessageUtil.success("保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
    @ApiOperation("通过id删除选课信息")
    @GetMapping("deleteById")
    public Message delete(
            @ApiParam(value = "主键", required = true) @RequestParam(value = "id") long id) {
        try {
            studentCourseService.deleteById(id);
            return MessageUtil.success("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
}
