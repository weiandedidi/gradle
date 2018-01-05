package com.qidi.grad.entry;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qidima
 * @date: 2018/1/4
 * Time: 16:38
 */
public class Depart implements Serializable {
    /**
     * 部门id
     */
    private Long id;
    /**
     * 部门名字
     */
    private String apartName;
    /**
     * 地址
     */
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApartName() {
        return apartName;
    }

    public void setApartName(String apartName) {
        this.apartName = apartName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
