package cn.edu.aynu.controller;

import cn.edu.aynu.entity.Teacher;
import cn.edu.aynu.service.ITeacherService;
import cn.edu.aynu.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherServiceImpl teacherService;

    @ResponseBody
    @GetMapping("/find/{id}")
    public Teacher findById(@PathVariable("id") Integer id){
        Teacher teacher = teacherService.findTeacherById(id);
        System.out.println(teacher);
        return teacher;
    }

    @PostMapping("/transfer")
    public String transfer(String tname,String sname,double money){
        if (teacherService.transfer(tname,sname,money)){
            return "success";
        }
        return "fail";
    }
}
