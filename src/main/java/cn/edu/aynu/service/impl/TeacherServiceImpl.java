package cn.edu.aynu.service.impl;

import cn.edu.aynu.entity.Student;
import cn.edu.aynu.entity.Teacher;
import cn.edu.aynu.mapper.StudentMapper;
import cn.edu.aynu.mapper.TeacherMapper;
import cn.edu.aynu.service.ITeacherService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service("teacherService")
//@Transactional()
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Teacher findTeacherById(Integer id) {
        return teacherMapper.selectById(id);
    }

    public boolean transfer(String tname,String sname, double money) {
        Teacher teacher = teacherMapper.selectByName(tname);
        Student student = studentMapper.selectByName(sname);
        teacher.setTmoney(teacher.getTmoney()-money);
        student.setSmoney(student.getSmoney()+money);
        int i = teacherMapper.updateTea(teacher);
        int g = 1/0;
        int i1 = studentMapper.updateStu(student);
        return i+i1 >1 ? true:false;
    }
}
