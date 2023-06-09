package com.springboot.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.springboot.mybatis.annotation.SensitiveData;
import com.springboot.mybatis.annotation.SensitiveField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author FlyFish
 * @Link https://github.com/oddnumber7
 * @ClassName Student
 * @Create 2023/4/11 17:59
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SensitiveData
@TableName(value = "t_student")
public class Student implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "name")
    @SensitiveField
    private String name;

    @TableField("age")
    private Integer age;

    @TableField("addr")
    private String addr;

    public Student(String name, Integer age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

}
