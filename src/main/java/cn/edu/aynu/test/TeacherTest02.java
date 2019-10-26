package cn.edu.aynu.test;

import cn.edu.aynu.entity.Teacher;
import cn.edu.aynu.mapper.TeacherMapper;
import cn.edu.aynu.service.ITeacherService;
import cn.edu.aynu.service.impl.TeacherServiceImpl;
import cn.edu.aynu.utils.SpringUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest02 {

    @Test
    public void test02(){
        ApplicationContext ac = SpringUtil.getAc();
        TeacherMapper teacherMapper = ac.getBean("teacherMapper", TeacherMapper.class);
        Teacher teacher = teacherMapper.selectById(1);
        System.out.println(teacher);
    }

    @Test
    public void test03(){
        ApplicationContext ac = SpringUtil.getAc();
        ITeacherService teacherService = ac.getBean("teacherService", ITeacherService.class);
        Teacher teacher = teacherService.findTeacherById(1);
        System.out.println(teacher);
    }

    @Test
    public void test04(){
        ApplicationContext ac = SpringUtil.getAc();
        ITeacherService teacherService = ac.getBean("teacherService", ITeacherService.class);
        boolean b = teacherService.transfer("王老师", "学生1", 1000f);
        System.out.println(b);
    }
}
