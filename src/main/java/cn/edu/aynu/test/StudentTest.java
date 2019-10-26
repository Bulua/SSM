package cn.edu.aynu.test;

import cn.edu.aynu.entity.Student;
import cn.edu.aynu.mapper.StudentMapper;
import cn.edu.aynu.utils.SpringUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class StudentTest {

    @Test
    public void t1(){
        ApplicationContext ac = SpringUtil.getAc();
        StudentMapper studentMapper = ac.getBean("studentMapper", StudentMapper.class);
        Student student = studentMapper.selectById(1);
        System.out.println(student);
    }
}
