package cn.edu.aynu.mapper;

import cn.edu.aynu.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {

    Teacher selectById(Integer id);

    Teacher selectByName(String tname);

    int updateTea(Teacher teacher);
}
