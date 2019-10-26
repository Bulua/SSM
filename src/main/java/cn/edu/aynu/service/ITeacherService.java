package cn.edu.aynu.service;

import cn.edu.aynu.entity.Teacher;

import java.util.Map;

public interface ITeacherService {

    public Teacher findTeacherById(Integer id);

    public boolean transfer(String tname,String sname, double money);
}
