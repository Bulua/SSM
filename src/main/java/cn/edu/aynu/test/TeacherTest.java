package cn.edu.aynu.test;

import cn.edu.aynu.entity.Teacher;
import cn.edu.aynu.mapper.TeacherMapper;
import cn.edu.aynu.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest {

    private TeacherMapper teacherMapper;
    private SqlSession sqlSession;

    @Before
    public void before(){
        sqlSession = MybatisUtil.getSqlSession();
        teacherMapper = sqlSession.getMapper(TeacherMapper.class);
    }

    @After
    public void after(){
        if (sqlSession != null){
            sqlSession.close();
        }
    }

    @Test
    public void test01(){
        Teacher teacher = teacherMapper.selectById(1);
        System.out.println(teacher);
    }


}
