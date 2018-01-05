package com.qidi.grad.entry;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qidima
 * @date: 2018/1/4
 * Time: 16:38
 */
public class User implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 名字
     */
    private String name;
    /**
     * 部门id
     */
    private Integer departid;
    /**
     * 年龄
     */
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
