package cn.edu.aynu.mapper;

import cn.edu.aynu.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends BaseMapper<Student> {

    Student selectByName(String sname);

    int updateStu(Student student);
}
