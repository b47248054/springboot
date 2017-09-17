package com.wanye.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by wanye on 2017/6/3.
 */
public class User {
    private int id;
    @NotBlank(message = "姓名不能为空")
    @Length(min = 3,max = 10,message = "姓名长度需要再[3-10]字之间")
    private String name;
    @Min(value = 18,message = "年龄需要大于18岁")
    @Max(value = 28,message = "年龄不能大于28岁")
    @Range(min = 18,max = 28,"我只喜欢年轻的")
    private int age;
    private int create;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCreate() {
        return create;
    }

    public void setCreate(int create) {
        this.create = create;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", create=" + create +
                '}';
    }
}
