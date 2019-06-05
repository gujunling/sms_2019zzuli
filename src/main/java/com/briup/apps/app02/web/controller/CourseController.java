package com.briup.apps.app02.web.controller;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.User;
import com.briup.apps.app02.service.ICourseService;
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
 * @create 2019-06-05-12:17
 */
@RestController
@RequestMapping("/course")
public class CourseController {
   @Autowired
    private ICourseService courseService;
   @ApiOperation("模糊查询")
   @GetMapping("query")
   public Message query(Course course){
       List<Course> list=courseService.query(course);
       return MessageUtil.success("success",list);
   }

   @ApiOperation("查询所有课程")
    @GetMapping("findAll")
    public Message findAll(){
       List<Course> list=courseService.findAll();
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过id查询课程")
    @GetMapping("findById")
    public Message findById(
            @ApiParam(value = "主键", required = true) @RequestParam(value = "id") long id) {
       Course course=courseService.findById(id);
        return MessageUtil.success("success",course);
    }

    @ApiOperation("保存或更新课程信息")
    @GetMapping("saveOrupdate")
    public Message saveOrupdate(Course course) {
        try {
            courseService.saveOrupdate(course);
            return MessageUtil.success("保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
    @ApiOperation("通过id删除课程信息")
    @GetMapping("deleteById")
    public Message deleteById(@ApiParam (value = "ID",required = true)@RequestParam(value = "id")long id){
        try {
            courseService.deleteById(id);
            return MessageUtil.success("删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
}
