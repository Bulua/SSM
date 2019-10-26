package cn.edu.aynu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Serializable {

    private Integer tid;
    private String tname;
    private Integer tage;
    private double tmoney;
}
