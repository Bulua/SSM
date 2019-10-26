package cn.edu.aynu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private Integer sid;
    private String sname;
    private Integer sage;
    private double smoney;

    private Teacher teacher;

}
